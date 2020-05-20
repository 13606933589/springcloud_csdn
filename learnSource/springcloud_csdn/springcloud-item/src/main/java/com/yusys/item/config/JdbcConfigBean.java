package com.yusys.item.config;/**
 * 2020/5/12.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/12 16:38
 **/
//@Component
@RefreshScope
public class JdbcConfigBean {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDriverClassName() {
        return driverClassName;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    @Override
    public String toString() {
        return "JdbcConfigBean [url=" + url + ", username=" + username
                + ", password=" + password + ", driverClassName="
                + driverClassName + "]";
    }
}
