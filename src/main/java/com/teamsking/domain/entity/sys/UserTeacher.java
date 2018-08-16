package com.teamsking.domain.entity.sys;

import javax.persistence.*;

@Table(name = "`user_teacher`")
public class UserTeacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher.id
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher.user_name
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher.user_id
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher.delete_status
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    private Integer deleteStatus;

    private Integer schoolId;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher.id
     *
     * @return the value of user_teacher.id
     *

     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher.id
     *
     * @param id the value for user_teacher.id
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher.user_name
     *
     * @return the value of user_teacher.user_name
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher.user_name
     *
     * @param userName the value for user_teacher.user_name
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher.user_id
     *
     * @return the value of user_teacher.user_id
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher.user_id
     *
     * @param userId the value for user_teacher.user_id
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher.delete_status
     *
     * @return the value of user_teacher.delete_status
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher.delete_status
     *
     * @param deleteStatus the value for user_teacher.delete_status
     *
     * @mbg.generated Mon Aug 13 10:06:46 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}