package com.teamsking.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`course_section`")
public class CourseSection {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.chapter_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer chapterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.diaplay_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer diaplayOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_section.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer deleteStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.id
     *
     * @return the value of course_section.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.id
     *
     * @param id the value for course_section.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.chapter_id
     *
     * @return the value of course_section.chapter_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.chapter_id
     *
     * @param chapterId the value for course_section.chapter_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.course_id
     *
     * @return the value of course_section.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.course_id
     *
     * @param courseId the value for course_section.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.title
     *
     * @return the value of course_section.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.title
     *
     * @param title the value for course_section.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.diaplay_order
     *
     * @return the value of course_section.diaplay_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDiaplayOrder() {
        return diaplayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.diaplay_order
     *
     * @param diaplayOrder the value for course_section.diaplay_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDiaplayOrder(Integer diaplayOrder) {
        this.diaplayOrder = diaplayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.create_id
     *
     * @return the value of course_section.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.create_id
     *
     * @param createId the value for course_section.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.create_time
     *
     * @return the value of course_section.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.create_time
     *
     * @param createTime the value for course_section.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.update_id
     *
     * @return the value of course_section.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.update_id
     *
     * @param updateId the value for course_section.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.update_time
     *
     * @return the value of course_section.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.update_time
     *
     * @param updateTime the value for course_section.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_section.delete_status
     *
     * @return the value of course_section.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_section.delete_status
     *
     * @param deleteStatus the value for course_section.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}