package com.mini.miniapp.service;

import com.mini.miniapp.pojo.News;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:guan
 * @2020/3/23 17:50
 * 文件信息：
 */

public interface NewsService {
    //通过typeid查找消息
    List<News> queryNewsById(Integer typeId);
    //添加新的信息
    String saveNewsByTypeId(News news);
}
