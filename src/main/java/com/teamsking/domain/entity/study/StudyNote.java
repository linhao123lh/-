package com.teamsking.domain.entity.study;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`study_note`")
public class StudyNote {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.open_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.unit_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer unitId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.user_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.public_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Boolean publicStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.vote_log_count
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer voteLogCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.collect_count
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer collectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.create_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.create_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.update_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.update_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.delete_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_note.note_body
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private String noteBody;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.id
     *
     * @return the value of study_note.id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.id
     *
     * @param id the value for study_note.id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.open_id
     *
     * @return the value of study_note.open_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.open_id
     *
     * @param openId the value for study_note.open_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.unit_id
     *
     * @return the value of study_note.unit_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.unit_id
     *
     * @param unitId the value for study_note.unit_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.user_id
     *
     * @return the value of study_note.user_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.user_id
     *
     * @param userId the value for study_note.user_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.public_status
     *
     * @return the value of study_note.public_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Boolean getPublicStatus() {
        return publicStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.public_status
     *
     * @param publicStatus the value for study_note.public_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setPublicStatus(Boolean publicStatus) {
        this.publicStatus = publicStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.vote_log_count
     *
     * @return the value of study_note.vote_log_count
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getVoteLogCount() {
        return voteLogCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.vote_log_count
     *
     * @param voteLogCount the value for study_note.vote_log_count
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setVoteLogCount(Integer voteLogCount) {
        this.voteLogCount = voteLogCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.collect_count
     *
     * @return the value of study_note.collect_count
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getCollectCount() {
        return collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.collect_count
     *
     * @param collectCount the value for study_note.collect_count
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.create_id
     *
     * @return the value of study_note.create_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.create_id
     *
     * @param createId the value for study_note.create_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.create_time
     *
     * @return the value of study_note.create_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.create_time
     *
     * @param createTime the value for study_note.create_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.update_id
     *
     * @return the value of study_note.update_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.update_id
     *
     * @param updateId the value for study_note.update_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.update_time
     *
     * @return the value of study_note.update_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.update_time
     *
     * @param updateTime the value for study_note.update_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.delete_status
     *
     * @return the value of study_note.delete_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.delete_status
     *
     * @param deleteStatus the value for study_note.delete_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_note.note_body
     *
     * @return the value of study_note.note_body
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public String getNoteBody() {
        return noteBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_note.note_body
     *
     * @param noteBody the value for study_note.note_body
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }
}