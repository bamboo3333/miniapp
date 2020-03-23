package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.News;
import com.mini.miniapp.utils.MyMapper;

public interface NewsMapper extends MyMapper<News> {
    public News queryNewsById(String typeId);
}