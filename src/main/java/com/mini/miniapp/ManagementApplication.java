package com.mini.miniapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("/com.mini.miniapp.mapper")
@ServletComponentScan(basePackages = "com.mini.miniapp.filter")
public class ManagementApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(ManagementApplication.class, args);
    }

}
