package com.teamsking.domain.entity.open;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`open_user`")
public class OpenUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.group_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.group_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.leader_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Byte leaderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.last_item
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer lastItem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_user.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer deleteStatus;

    private Integer userStudentId;

    public Integer getUserStudentId() {
        return userStudentId;
    }

    public void setUserStudentId(Integer userStudentId) {
        this.userStudentId = userStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.id
     *
     * @return the value of open_user.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.id
     *
     * @param id the value for open_user.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.open_id
     *
     * @return the value of open_user.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.open_id
     *
     * @param openId the value for open_user.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.course_id
     *
     * @return the value of open_user.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.course_id
     *
     * @param courseId the value for open_user.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.group_id
     *
     * @return the value of open_user.group_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.group_id
     *
     * @param groupId the value for open_user.group_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.group_name
     *
     * @return the value of open_user.group_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.group_name
     *
     * @param groupName the value for open_user.group_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.leader_status
     *
     * @return the value of open_user.leader_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Byte getLeaderStatus() {
        return leaderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.leader_status
     *
     * @param leaderStatus the value for open_user.leader_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setLeaderStatus(Byte leaderStatus) {
        this.leaderStatus = leaderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.last_item
     *
     * @return the value of open_user.last_item
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getLastItem() {
        return lastItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.last_item
     *
     * @param lastItem the value for open_user.last_item
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setLastItem(Integer lastItem) {
        this.lastItem = lastItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.create_id
     *
     * @return the value of open_user.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.create_id
     *
     * @param createId the value for open_user.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.create_time
     *
     * @return the value of open_user.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.create_time
     *
     * @param createTime the value for open_user.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.update_id
     *
     * @return the value of open_user.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.update_id
     *
     * @param updateId the value for open_user.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.update_time
     *
     * @return the value of open_user.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.update_time
     *
     * @param updateTime the value for open_user.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_user.delete_status
     *
     * @return the value of open_user.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_user.delete_status
     *
     * @param deleteStatus the value for open_user.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}
