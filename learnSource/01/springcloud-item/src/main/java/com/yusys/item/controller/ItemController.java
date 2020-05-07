package com.yusys.item.controller;/**
 * 2020/5/7.
 */

import com.yusys.item.entity.Item;
import com.yusys.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/7 11:27
 **/
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 对外提供接口服务，查询商品信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        return this.itemService.queryItemById(id);
    }

}
