package com.teamsking.api.endpoint.open;

import com.github.pagehelper.PageHelper;
import com.teamsking.api.dto.open.OpenTeacherDto;
import com.teamsking.api.dto.open.OpenTeacherDtoMapper;
import com.teamsking.api.endpoint.BaseController;
import com.teamsking.domain.entity.open.OpenTeacher;
import com.teamsking.domain.service.open.OpenTeacherService;
import com.teamsking.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@Api(tags = "班次-教师管理操作接口")
public class OpenTeacherController extends BaseController {

    @Autowired
    OpenTeacherService openTeacherService;



    @ApiOperation(value = "班次-教师管理列表", notes = "可分页", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "页码", required = true, example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, example = "10")
    })
    @GetMapping("/open_teachers")
    public Result openTeacherList(int pageNo,int pageSize){

        PageHelper.startPage(fixPage(pageNo), fixPage(pageSize));

        List<OpenTeacher> openTeacherList = openTeacherService.list();

        List<OpenTeacherDto> openTeacherDtoList = OpenTeacherDtoMapper.INSTANCE.entityListToDtoList(openTeacherList);

        return Result.success().addData("pager", warpPage(openTeacherDtoList));

    }


    @ApiOperation(value = "添加班次-教师管理", consumes= "application/json")
    @ApiImplicitParams( {
            @ApiImplicitParam(name = "openTeacher", value = "班次教师管理", required = true, dataType = "OpenTeacherDto")
    })
    @PostMapping("/open_teacher")
    public Result addOpenTeacher(@RequestBody OpenTeacherDto openTeacher){

        OpenTeacher openTeacherEntity = OpenTeacherDtoMapper.INSTANCE.dtoToEntity(openTeacher);
        openTeacherService.save(openTeacherEntity);
        return Result.success();

    }


    @ApiOperation(value = "添加班次-教师管理", consumes= "application/json")
    @ApiImplicitParams( {
            @ApiImplicitParam(name = "id", value = "班次教师管理", required = true, dataType = "Integer")
    })
    @DeleteMapping("/open_teacher/{id}")
    public Result removeOpenTeacher(@PathVariable int id){

        openTeacherService.remove(id);
        return Result.success();

    }



    @ApiOperation(value = "添加班次-教师管理", consumes= "application/json")
    @ApiImplicitParams( {
            @ApiImplicitParam(name = "id", value = "班次教师管理", required = true, dataType = "Integer")
    })
    @PutMapping("/open_teacher/{id}")
    public Result modifyOpenTeacher(@PathVariable int id,
                                    @RequestBody OpenTeacherDto openTeacher){

        OpenTeacher openTeacherEntity = OpenTeacherDtoMapper.INSTANCE.dtoToEntity(openTeacher);
        openTeacherEntity.setId(id);
        openTeacherService.modify(openTeacherEntity);

        return Result.success();

    }

}