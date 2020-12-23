package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 血残微
 * @version 1.0
 * @Date 2020/12/21 15:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9011 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9011.class, args);
    }
}
