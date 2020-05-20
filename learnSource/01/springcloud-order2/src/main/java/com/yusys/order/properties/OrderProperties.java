package com.yusys.order.properties;/**
 * 2020/5/7.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/7 15:38
 **/
@Component
@ConfigurationProperties(prefix="myspcloud")
public class OrderProperties {
    private ItemProperties item = new ItemProperties();

    public ItemProperties getItem() {
        return item;
    }

    public void setItem(ItemProperties item) {
        this.item = item;
    }
}
