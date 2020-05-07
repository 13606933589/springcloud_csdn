package com.yusys.order;/**
 * 2020/5/7.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/7 15:03
 **/
@SpringBootApplication//申明这是一个Spring Boot项目
//@ComponentScan(basePackages = {"com.zpc.order.controller", "com.zpc.order.service"})
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }

    /**
     * 向Spring容器中定义RestTemplate对象
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
