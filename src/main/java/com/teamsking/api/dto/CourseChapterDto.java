package com.teamsking.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CourseChapterDto extends Dto {

    private Integer id;

    private Integer courseId;

    private String chapterName;

    private Integer displayOrder;

    private Integer createId;

    private Date createTime;

    private Integer updateId;

    private Date updateTime;

    private Integer deleteStatus;

    private Integer chapterStatus;

}
