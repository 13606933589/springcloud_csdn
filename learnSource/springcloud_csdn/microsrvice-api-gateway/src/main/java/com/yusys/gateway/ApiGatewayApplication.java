package com.yusys.gateway;/**
 * 2020/5/11.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/11 15:31
 **/
@EnableZuulProxy
@SpringBootApplication
@ComponentScan("com.yusys.filter")
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
