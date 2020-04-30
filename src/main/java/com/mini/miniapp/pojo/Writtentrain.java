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
}