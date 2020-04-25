package com.mini.miniapp;

/**
 * @author:guan
 * @2020/4/15 23:38
 * 文件信息：
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        //Application的类名
        return application.sources(ManagementApplication.class);
    }

}
