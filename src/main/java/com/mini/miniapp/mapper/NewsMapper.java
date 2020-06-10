package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.CompanyStatistics;
import com.mini.miniapp.pojo.JobStatistics;
import com.mini.miniapp.pojo.News;

import java.util.List;

public interface NewsMapper{
    void deleteNewsById(Integer id);


    void saveNewsByTypeId(News news);
    void updateNewsById(News news);

    List<News> queryAllNews();
    News queryNewsById(Integer typeId);
    List<News> queryNewsByType(Integer typeId);
    List<News> queryTodayNews(Integer type);

    List<JobStatistics> countJobType();
    List<CompanyStatistics> countCompany();
    List<String> countPosition();
}