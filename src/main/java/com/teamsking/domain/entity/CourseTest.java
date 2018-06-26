package com.teamsking.domain.entity;

import javax.persistence.*;

@Table(name = "`course_test`")
public class CourseTest {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.chapter_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer chapterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.section_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer sectionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer schoolId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.quiz_count
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer quizCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.is_limit
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer isLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.limit_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer limitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.hide_results
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Byte hideResults;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_test.submit_times
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer submitTimes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.id
     *
     * @return the value of course_test.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.id
     *
     * @param id the value for course_test.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.course_id
     *
     * @return the value of course_test.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.course_id
     *
     * @param courseId the value for course_test.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.chapter_id
     *
     * @return the value of course_test.chapter_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.chapter_id
     *
     * @param chapterId the value for course_test.chapter_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.section_id
     *
     * @return the value of course_test.section_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.section_id
     *
     * @param sectionId the value for course_test.section_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.school_id
     *
     * @return the value of course_test.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.school_id
     *
     * @param schoolId the value for course_test.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.title
     *
     * @return the value of course_test.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.title
     *
     * @param title the value for course_test.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.quiz_count
     *
     * @return the value of course_test.quiz_count
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getQuizCount() {
        return quizCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.quiz_count
     *
     * @param quizCount the value for course_test.quiz_count
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setQuizCount(Integer quizCount) {
        this.quizCount = quizCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.is_limit
     *
     * @return the value of course_test.is_limit
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getIsLimit() {
        return isLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.is_limit
     *
     * @param isLimit the value for course_test.is_limit
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setIsLimit(Integer isLimit) {
        this.isLimit = isLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.limit_time
     *
     * @return the value of course_test.limit_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getLimitTime() {
        return limitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.limit_time
     *
     * @param limitTime the value for course_test.limit_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.hide_results
     *
     * @return the value of course_test.hide_results
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Byte getHideResults() {
        return hideResults;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.hide_results
     *
     * @param hideResults the value for course_test.hide_results
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setHideResults(Byte hideResults) {
        this.hideResults = hideResults;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_test.submit_times
     *
     * @return the value of course_test.submit_times
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getSubmitTimes() {
        return submitTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_test.submit_times
     *
     * @param submitTimes the value for course_test.submit_times
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSubmitTimes(Integer submitTimes) {
        this.submitTimes = submitTimes;
    }
}