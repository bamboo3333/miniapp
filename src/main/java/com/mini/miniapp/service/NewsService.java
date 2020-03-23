package com.mini.miniapp.service;

import com.mini.miniapp.pojo.News;
import org.springframework.stereotype.Service;

/**
 * @author:guan
 * @2020/3/23 17:50
 * 文件信息：
 */

public interface NewsService {
    //通过typeid查找消息
    public News queryNewsById(String typeId);
}
