package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.NewsMapper;
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
    public List<News> queryNewsById(Integer typeId) {
        List<News> newsList = newsMapper.queryNewsById(typeId);
        return newsList;
    }

    @Override
    public String saveNewsByTypeId(News news) {
        newsMapper.saveNewsByTypeId(news);
        return null;
    }
}
