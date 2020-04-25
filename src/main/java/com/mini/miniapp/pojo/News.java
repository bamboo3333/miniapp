package com.mini.miniapp.pojo;

import javax.persistence.*;

public class News {
    @Id
    private Integer id;

    /**
     * 0:实习生1:全职生2:招聘生
     */
    @Column(name = "type_id")
    private Integer typeId;


    /**
     公司图片url
     */
    @Column(name = "cover_img")
    private String coverImg;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 招聘公司
     */
    private String publisher;

    /**
     * 招聘内容Url
     */
    private String contentUrl;
    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取0:实习生1:全职生2:招聘生
     *
     * @return type_id - 0:实习生1:全职生2:招聘生
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置0:实习生1:全职生2:招聘生
     *
     * @param typeId 0:实习生1:全职生2:招聘生
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }


    public String getCoverImg() {
        return coverImg;
    }

    /**
     * 设置如果img_type为1或者3的话，本字段必填。
是一个json数组
['']
['','','']
     *
     * @param coverImg 如果img_type为1或者3的话，本字段必填。
是一个json数组
['']
['','','']
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    /**
     * 获取消息标题
     *
     * @return title - 消息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消息标题
     *
     * @param title 消息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取消息发布者
     *
     * @return publisher - 消息发布者
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 设置消息发布者
     *
     * @param publisher 消息发布者
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

}