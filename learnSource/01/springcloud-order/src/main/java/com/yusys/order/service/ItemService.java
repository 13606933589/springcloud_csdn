package com.yusys.order.service;/**
 * 2020/5/7.
 */

import com.yusys.order.entity.Item;
import com.yusys.order.properties.OrderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/7 14:37
 **/
@Service
public class ItemService {
    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    OrderProperties orderProperties;

    public Item queryItemById(Long id) {
        return this.restTemplate.getForObject(orderProperties.getItem().getUrl()
                + id, Item.class);
    }
}
