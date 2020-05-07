package com.yusys.springcloud.eureka;/**
 * 2020/5/7.
 */

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/7 16:24
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Eureka注册中心
 */
@SpringBootApplication
//@EnableEurekaServer //申明这是一个Eureka服务
public class AppEureka {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class, args);
    }
}
