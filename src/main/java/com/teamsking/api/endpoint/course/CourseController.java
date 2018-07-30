package com.teamsking.api.endpoint.course;


import com.teamsking.api.dto.course.CourseInsertDto;
import com.teamsking.api.endpoint.BaseController;
import com.teamsking.domain.entity.course.Course;
import com.teamsking.domain.service.category.CategoryService;
import com.teamsking.domain.service.course.CourseService;
import com.teamsking.domain.service.course.CourseTeacherService;
import com.teamsking.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "课程操作接口")
@Slf4j
public class CourseController extends BaseController {

    @Autowired
    CourseService courseService;
    @Autowired
    CourseTeacherService courseTeacherService;

    @Autowired
    CategoryService categoryService;

    @ApiOperation(value = "课程列表", notes = "可分页", produces = "application/json")
    @ApiImplicitParams( {
        @ApiImplicitParam(name = "pageNo", paramType = "query", value = "页码", required = true, example = "1"),
        @ApiImplicitParam(name = "pageSize", paramType = "query", value = "页大小", required = true, example = "10")
    })
    @GetMapping("/courses")
    public Result courseList(@RequestParam int pageNo, @RequestParam int pageSize) {
        return Result.success().addData("pager", warpPage(courseService.list(fixPage(pageNo), fixPage(pageSize))));
    }



    @ApiOperation(value = "添加课程", consumes = "application/json")
    @ApiImplicitParams( {
        @ApiImplicitParam(name = "courseInsertDto", value = "课程", required = true, dataType = "CourseInsertDto")
    })
    @PostMapping("/course")
    public Result addCourse(@RequestBody CourseInsertDto courseInsertDto) {

        Course course = courseService.save(courseInsertDto);
        return Result.success().addData("course",course);
    }



    @ApiOperation(value = "修改课程状态", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "课程的主键", required = true)
    })
    @PutMapping("/course/{id}/status")
    public Result modifyCourseSatus(@PathVariable("id") int id){

        courseService.modifyCourseSatusById(id);
        return Result.success();
    }


    @ApiOperation(value = "批量删除课程",produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids",value = "课程的主键", required = true)
    })
    @DeleteMapping("/courses/multi_delete")
    public Result removeMultiCourse(@RequestParam Integer[] ids){

        courseService.romoveCourseByIds(ids);
        return Result.success();

    }

    @ApiOperation(value = "一级分类下的课程列表",produces = "application/json")
    @ApiImplicitParams( {
            @ApiImplicitParam(name = "id", value = "一级分类的主键", required = true ,dataType = "Integer")
    })
    @GetMapping("/first_category/{id}/courses")
    public Result courseOpenList(@PathVariable int id){

        return Result.success().addData("pager",courseService.getCourseListByCategoryId(id));

    }



}
