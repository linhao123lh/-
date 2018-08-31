package com.teamsking.domain.entity.open;

import javax.persistence.*;

@Table(name = "`open_assignment_quiz`")
public class OpenAssignmentQuiz {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_assignment_quiz.id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_assignment_quiz.quiz_id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    private Integer quizId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_assignment_quiz.assignment_id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    private Integer assignmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_assignment_quiz.delete_status
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    private Integer deleteStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_assignment_quiz.id
     *
     * @return the value of open_assignment_quiz.id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_assignment_quiz.id
     *
     * @param id the value for open_assignment_quiz.id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_assignment_quiz.quiz_id
     *
     * @return the value of open_assignment_quiz.quiz_id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public Integer getQuizId() {
        return quizId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_assignment_quiz.quiz_id
     *
     * @param quizId the value for open_assignment_quiz.quiz_id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public void setQuizId(Integer quizId) {
        this.quizId = quizId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_assignment_quiz.assignment_id
     *
     * @return the value of open_assignment_quiz.assignment_id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public Integer getAssignmentId() {
        return assignmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_assignment_quiz.assignment_id
     *
     * @param assignmentId the value for open_assignment_quiz.assignment_id
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_assignment_quiz.delete_status
     *
     * @return the value of open_assignment_quiz.delete_status
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_assignment_quiz.delete_status
     *
     * @param deleteStatus the value for open_assignment_quiz.delete_status
     *
     * @mbg.generated Tue Aug 28 14:22:59 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}