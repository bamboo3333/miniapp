package com.mini.miniapp.service;

import com.mini.miniapp.pojo.CompanyStatistics;
import com.mini.miniapp.pojo.JobStatistics;
import com.mini.miniapp.pojo.News;

import java.util.List;

/**
 * @author:guan
 * @2020/3/23 17:50
 * 文件信息：
 */

public interface NewsService {
    //查找多有信息
    List<News> queryAllNews();
    //通过typeid查找消息
    News queryNewsById(Integer typeId);
    //添加新的信息
    String saveNewsByTypeId(News news);
    //修改信息
    String modifyNewsById(News news);
    //删除指定信息
    String deleteNewsById(Integer id);
    //根据typeId查找实习生/全职生/兼职生信息
    List<News> queryNewsByType(Integer typeId);
    //根据类型查询今日校招和热门推荐
    List<News> queryTodayNews(Integer type);
    //统计实习类型和人数
    List<JobStatistics> countJobType();
    //招聘公司统计
    List<CompanyStatistics> countCompany();


}
