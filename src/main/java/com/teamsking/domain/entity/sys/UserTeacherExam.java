package com.teamsking.domain.entity.sys;

import javax.persistence.*;

@Table(name = "`user_teacher_exam`")
public class UserTeacherExam {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher_exam.id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher_exam.exam_id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    private Integer examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher_exam.user_teacher_id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    private Integer userTeacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_teacher_exam.delete_status
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    private Integer deleteStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher_exam.id
     *
     * @return the value of user_teacher_exam.id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher_exam.id
     *
     * @param id the value for user_teacher_exam.id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher_exam.exam_id
     *
     * @return the value of user_teacher_exam.exam_id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher_exam.exam_id
     *
     * @param examId the value for user_teacher_exam.exam_id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher_exam.user_teacher_id
     *
     * @return the value of user_teacher_exam.user_teacher_id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public Integer getUserTeacherId() {
        return userTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher_exam.user_teacher_id
     *
     * @param userTeacherId the value for user_teacher_exam.user_teacher_id
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public void setUserTeacherId(Integer userTeacherId) {
        this.userTeacherId = userTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_teacher_exam.delete_status
     *
     * @return the value of user_teacher_exam.delete_status
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_teacher_exam.delete_status
     *
     * @param deleteStatus the value for user_teacher_exam.delete_status
     *
     * @mbg.generated Fri Aug 31 11:04:46 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}