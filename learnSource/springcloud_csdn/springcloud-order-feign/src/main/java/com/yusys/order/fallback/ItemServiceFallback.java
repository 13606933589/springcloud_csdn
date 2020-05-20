package com.yusys.order.fallback;/**
 * 2020/5/11.
 */

import com.yusys.order.entity.Item;
import com.yusys.order.feign.ItemFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/11 10:52
 **/
@Component
public class ItemServiceFallback implements ItemFeignClient {
    /**
     * 服务降级的方法要和原方法一致(名称、参数列表)
     * @param id
     * @return
     */
    @Override
    public Item queryItemById(@PathVariable("id") Long id) {
        return new Item(id, "服务降级方法queryItemById", null, "服务降级方法queryItemById", null);
    }
}
