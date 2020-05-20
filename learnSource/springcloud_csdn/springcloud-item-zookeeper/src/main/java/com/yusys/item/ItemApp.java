package com.yusys.item;/**
 * 2020/5/7.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/7 11:29
 **/
@SpringBootApplication//申明这是一个Spring Boot项目
@EnableDiscoveryClient
//@ComponentScan(basePackages = {"com.zpc.item.controller","com.zpc.item.service"})//手动指定bean组件扫描范围
public class ItemApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class, args);
    }
}
