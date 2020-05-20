package com.yusys.configcenter;/**
 * 2020/5/12.
 */

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/12 15:40
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 开启配置服务
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
