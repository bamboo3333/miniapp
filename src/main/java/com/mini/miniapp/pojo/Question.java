package com.mini.miniapp.pojo;

import java.util.Date;
import javax.persistence.*;

public class Question {
    /**
     * 默认id
     */
    @Id
    private Integer id;

    /**
     * 题目id
     */
    @Column(name = "title_id")
    private String titleId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 题目描述
     */
    @Column(name = "title_desc")
    private String titleDesc;

    /**
     * 解题思路
     */
    @Column(name = "title_iead")
    private String titleIead;

    /**
     * 完成时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 获取默认id
     *
     * @return id - 默认id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置默认id
     *
     * @param id 默认id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取题目id
     *
     * @return title_id - 题目id
     */
    public String getTitleId() {
        return titleId;
    }

    /**
     * 设置题目id
     *
     * @param titleId 题目id
     */
    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取题目描述
     *
     * @return title_desc - 题目描述
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * 设置题目描述
     *
     * @param titleDesc 题目描述
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    /**
     * 获取解题思路
     *
     * @return title_iead - 解题思路
     */
    public String getTitleIead() {
        return titleIead;
    }

    /**
     * 设置解题思路
     *
     * @param titleIead 解题思路
     */
    public void setTitleIead(String titleIead) {
        this.titleIead = titleIead;
    }

    /**
     * 获取完成时间
     *
     * @return finish_time - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}