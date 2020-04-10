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
}
