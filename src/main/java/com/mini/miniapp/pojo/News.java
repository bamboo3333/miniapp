package com.mini.miniapp.pojo;

import javax.persistence.*;

public class News {
    @Id
    private String id;

    @Column(name = "type_id")
    private String typeId;

    /**
     * 新闻列表显示模式：
0：纯文字，无图片
1：有一张图片
3：有三张图片
     */
    @Column(name = "img_type")
    private Integer imgType;

    /**
     * 如果img_type为1或者3的话，本字段必填。
是一个json数组
['']
['','','']
     */
    @Column(name = "cover_img")
    private String coverImg;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 发布者
     */
    private String publisher;

    /**
     * 发布者头像
     */
    @Column(name = "publisher_face")
    private String publisherFace;

    /**
     * 发布时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return type_id
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取新闻列表显示模式：
0：纯文字，无图片
1：有一张图片
3：有三张图片
     *
     * @return img_type - 新闻列表显示模式：
0：纯文字，无图片
1：有一张图片
3：有三张图片
     */
    public Integer getImgType() {
        return imgType;
    }

    /**
     * 设置新闻列表显示模式：
0：纯文字，无图片
1：有一张图片
3：有三张图片
     *
     * @param imgType 新闻列表显示模式：
0：纯文字，无图片
1：有一张图片
3：有三张图片
     */
    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    /**
     * 获取如果img_type为1或者3的话，本字段必填。
是一个json数组
['']
['','','']
     *
     * @return cover_img - 如果img_type为1或者3的话，本字段必填。
是一个json数组
['']
['','','']
     */
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
     * 获取新闻标题
     *
     * @return title - 新闻标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置新闻标题
     *
     * @param title 新闻标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取发布者
     *
     * @return publisher - 发布者
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 设置发布者
     *
     * @param publisher 发布者
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * 获取发布者头像
     *
     * @return publisher_face - 发布者头像
     */
    public String getPublisherFace() {
        return publisherFace;
    }

    /**
     * 设置发布者头像
     *
     * @param publisherFace 发布者头像
     */
    public void setPublisherFace(String publisherFace) {
        this.publisherFace = publisherFace;
    }

    /**
     * 获取发布时间
     *
     * @return create_time - 发布时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置发布时间
     *
     * @param createTime 发布时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取新闻内容
     *
     * @return content - 新闻内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置新闻内容
     *
     * @param content 新闻内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}