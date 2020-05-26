/**
 * 2020/5/22.
 */
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/22 11:07
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8002.class, args);
    }
}
