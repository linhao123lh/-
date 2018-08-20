package com.teamsking.domain.entity.open;

import javax.persistence.*;

@Table(name = "`open_user_teacher`")
public class OpenUserTeacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user_teacher.id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user_teacher.open_id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user_teacher.user_teacher_id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    private Integer userTeacherId;

    private Integer groupId;

    private Integer deleteStatus;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user_teacher.id
     *
     * @return the value of open_user_teacher.id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user_teacher.id
     *
     * @param id the value for open_user_teacher.id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user_teacher.open_id
     *
     * @return the value of open_user_teacher.open_id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user_teacher.open_id
     *
     * @param openId the value for open_user_teacher.open_id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user_teacher.user_teacher_id
     *
     * @return the value of open_user_teacher.user_teacher_id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    public Integer getUserTeacherId() {
        return userTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user_teacher.user_teacher_id
     *
     * @param userTeacherId the value for open_user_teacher.user_teacher_id
     *
     * @mbg.generated Mon Aug 13 17:36:20 CST 2018
     */
    public void setUserTeacherId(Integer userTeacherId) {
        this.userTeacherId = userTeacherId;
    }

}