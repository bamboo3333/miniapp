package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.NewsMapper;
import com.mini.miniapp.pojo.News;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    public News queryNewsById(String typeId) {
        News news = newsMapper.queryNewsById(typeId);
        return news;
    }
}
