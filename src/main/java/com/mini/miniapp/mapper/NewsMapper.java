package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.News;
import com.mini.miniapp.utils.MyMapper;

import java.util.List;

public interface NewsMapper{
    News queryNewsById(Integer id);
    void saveNewsByTypeId(News news);
    List<News> queryAllNews();
    void updateNewsById(News news);
    void deleteNewsById(Integer id);
}