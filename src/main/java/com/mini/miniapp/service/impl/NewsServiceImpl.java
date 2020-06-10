package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.NewsMapper;
import com.mini.miniapp.pojo.CompanyStatistics;
import com.mini.miniapp.pojo.JobStatistics;
import com.mini.miniapp.pojo.News;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/3/23 17:51
 * 文件信息：
 */
@Service
public class NewsServiceImpl implements com.mini.miniapp.service.NewsService {
    @Resource
    private NewsMapper newsMapper;

    @Override
    public List<News> queryAllNews() {
        return newsMapper.queryAllNews();
    }

    @Override
    public News queryNewsById(Integer typeId) {
        News news = newsMapper.queryNewsById(typeId);
        return news;
    }

    @Override
    public String saveNewsByTypeId(News news) {
        newsMapper.saveNewsByTypeId(news);
        return null;
    }

    @Override
    public String modifyNewsById(News news) {
        newsMapper.updateNewsById(news);
        return null;
    }

    @Override
    public String deleteNewsById(Integer id) {
        newsMapper.deleteNewsById(id);
        return null;
    }

    @Override
    public List<News> queryNewsByType(Integer typeId) {
        return newsMapper.queryNewsByType(typeId);
    }

    @Override
    public List<News> queryTodayNews(Integer type) {
        return newsMapper.queryTodayNews(type);
    }

    @Override
    public List<JobStatistics> countJobType() {
        return newsMapper.countJobType();
    }

    @Override
    public List<CompanyStatistics> countCompany() {
        return newsMapper.countCompany();
    }

    @Override
    public List<String> countPosition() {
        return newsMapper.countPosition();
    }

}
