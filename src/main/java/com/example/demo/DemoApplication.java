package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.QueryParams;

@SpringBootApplication
@ComponentScan
@EnableApolloConfig
@MapperScan(basePackages = "com.example.demo.mapper")
@EnableFeignClients
@ServletComponentScan(basePackages = "com.example.demo")
public class DemoApplication {
    @Autowired
    private static ConsulClient consulClient;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
