package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.News;
import com.mini.miniapp.utils.MyMapper;

import java.util.List;

public interface NewsMapper{
    List<News> queryNewsById(Integer typeId);
    void saveNewsByTypeId(News news);
}