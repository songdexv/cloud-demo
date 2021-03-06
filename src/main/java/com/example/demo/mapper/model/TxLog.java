package com.example.demo.mapper.model;

import java.time.LocalDateTime;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tx_log
 */
public class TxLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_log.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_log.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_log.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_log.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_log.id
     *
     * @return the value of tx_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_log.id
     *
     * @param id the value for tx_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_log.content
     *
     * @return the value of tx_log.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_log.content
     *
     * @param content the value for tx_log.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_log.status
     *
     * @return the value of tx_log.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_log.status
     *
     * @param status the value for tx_log.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_log.create_time
     *
     * @return the value of tx_log.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_log.create_time
     *
     * @param createTime the value for tx_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_log.update_time
     *
     * @return the value of tx_log.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_log.update_time
     *
     * @param updateTime the value for tx_log.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}