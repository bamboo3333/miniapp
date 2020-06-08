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
     * 图片url
     */
    @Column(name = "cover_img")
    private String coverImg;

    /**
     * 招聘信息标题
     */
    private String title;

    /**
     * 招聘公司
     */
    private String publisher;

    /**
     * 公众号链接
     */
    @Column(name = "content_url")
    private Integer todayNews;

    /**
     * 招聘类型(实习生，全职生，兼职生)
     */
    private String type;

    /**
     * 应聘要求描述
     */
    private String desc;

    /**
     * 工作安排
     */
    @Column(name = "work_type")
    private String workType;

    /**
     * 职位描述
     */
    @Column(name = "job_desc")
    private String jobDesc;

    /**
     * 职位要求
     */
    @Column(name = "job_req")
    private String jobReq;

    /**
     * 公司介绍
     */
    @Column(name = "company_desc")
    private String companyDesc;

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

    /**
     * 获取图片url
     *
     * @return cover_img - 图片url
     */
    public String getCoverImg() {
        return coverImg;
    }

    /**
     * 设置图片url
     *
     * @param coverImg 图片url
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    /**
     * 获取招聘信息标题
     *
     * @return title - 招聘信息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置招聘信息标题
     *
     * @param title 招聘信息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取招聘公司
     *
     * @return publisher - 招聘公司
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 设置招聘公司
     *
     * @param publisher 招聘公司
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public Integer getTodayNews() {
        return todayNews;
    }

    public void setTodayNews(Integer todayNews) {
        this.todayNews = todayNews;
    }

    /**
     * 获取招聘类型(实习生，全职生，兼职生)
     *
     * @return type - 招聘类型(实习生，全职生，兼职生)
     */
    public String getType() {
        return type;
    }

    /**
     * 设置招聘类型(实习生，全职生，兼职生)
     *
     * @param type 招聘类型(实习生，全职生，兼职生)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取应聘要求描述
     *
     * @return desc - 应聘要求描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置应聘要求描述
     *
     * @param desc 应聘要求描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取工作安排
     *
     * @return work_type - 工作安排
     */
    public String getWorkType() {
        return workType;
    }

    /**
     * 设置工作安排
     *
     * @param workType 工作安排
     */
    public void setWorkType(String workType) {
        this.workType = workType;
    }

    /**
     * 获取职位描述
     *
     * @return job_desc - 职位描述
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * 设置职位描述
     *
     * @param jobDesc 职位描述
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    /**
     * 获取职位要求
     *
     * @return job_req - 职位要求
     */
    public String getJobReq() {
        return jobReq;
    }

    /**
     * 设置职位要求
     *
     * @param jobReq 职位要求
     */
    public void setJobReq(String jobReq) {
        this.jobReq = jobReq;
    }

    /**
     * 获取公司介绍
     *
     * @return company_desc - 公司介绍
     */
    public String getCompanyDesc() {
        return companyDesc;
    }

    /**
     * 设置公司介绍
     *
     * @param companyDesc 公司介绍
     */
    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }
}