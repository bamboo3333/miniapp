package com.mini.miniapp.pojo;

import javax.persistence.*;

public class Writtentrain {
    /**
     * 自身id
     */
    @Id
    private Integer id;

    /**
     * 题目id
     */
    @Column(name = "title_id")
    private String titleId;

    /**
     * 题目类型
     */
    @Column(name = "title_type")
    private String titleType;

    /**
     * 题目简单描述
     */
    @Column(name = "title_desc")
    private String titleDesc;

    /**
     * 原题url
     */
    @Column(name = "title_url")
    private String titleUrl;

    /**
     * 题目名称
     */
    @Column(name = "title_name")
    private String titleName;

    /**
     * 限制时间
     */
    @Column(name = "title_time")
    private Integer titleTime;

    /**
     * 习题logo
     */
    @Column(name = "title_img")
    private String titleImg;

    /**
     * 示例
     */
    @Column(name = "title_exp")
    private String titleExp;

    /**
     * 题目备注
     */
    @Column(name = "title_remark")
    private String titleRemark;

    /**
     * 获取自身id
     *
     * @return id - 自身id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自身id
     *
     * @param id 自身id
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
     * 获取题目类型
     *
     * @return title_type - 题目类型
     */
    public String getTitleType() {
        return titleType;
    }

    /**
     * 设置题目类型
     *
     * @param titleType 题目类型
     */
    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    /**
     * 获取题目简单描述
     *
     * @return title_desc - 题目简单描述
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * 设置题目简单描述
     *
     * @param titleDesc 题目简单描述
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    /**
     * 获取原题url
     *
     * @return title_url - 原题url
     */
    public String getTitleUrl() {
        return titleUrl;
    }

    /**
     * 设置原题url
     *
     * @param titleUrl 原题url
     */
    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    /**
     * 获取题目名称
     *
     * @return title_name - 题目名称
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * 设置题目名称
     *
     * @param titleName 题目名称
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    /**
     * 获取限制时间
     *
     * @return title_time - 限制时间
     */
    public Integer getTitleTime() {
        return titleTime;
    }

    /**
     * 设置限制时间
     *
     * @param titleTime 限制时间
     */
    public void setTitleTime(Integer titleTime) {
        this.titleTime = titleTime;
    }

    /**
     * 获取习题logo
     *
     * @return title_img - 习题logo
     */
    public String getTitleImg() {
        return titleImg;
    }

    /**
     * 设置习题logo
     *
     * @param titleImg 习题logo
     */
    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    /**
     * 获取示例
     *
     * @return title_exp - 示例
     */
    public String getTitleExp() {
        return titleExp;
    }

    /**
     * 设置示例
     *
     * @param titleExp 示例
     */
    public void setTitleExp(String titleExp) {
        this.titleExp = titleExp;
    }

    /**
     * 获取题目备注
     *
     * @return title_remark - 题目备注
     */
    public String getTitleRemark() {
        return titleRemark;
    }

    /**
     * 设置题目备注
     *
     * @param titleRemark 题目备注
     */
    public void setTitleRemark(String titleRemark) {
        this.titleRemark = titleRemark;
    }
}