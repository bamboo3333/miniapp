package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.Administrator;

/**
 * @author:guan
 * @2020/4/1 20:53
 * 文件信息：
 */
public interface AdminMapper {
    //管理员登录
    Administrator login(Administrator admin);
}
