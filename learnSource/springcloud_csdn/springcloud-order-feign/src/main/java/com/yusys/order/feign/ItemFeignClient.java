package com.yusys.order.feign;/**
 * 2020/5/11.
 */

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/11 9:41
 **/

import com.yusys.order.entity.Item;
import com.yusys.order.fallback.ItemServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 申明这是一个Feign客户端，并且指明服务id
 * 实际开发中ItemFeignClient一般直接继承(extends)服务提供方的接口以避免代码重复（例如Item工程会以jar包的形式提供ItemService接口）
 * @author shuai
 */
@FeignClient(value = "app-item", fallback = ItemServiceFallback.class)
public interface ItemFeignClient {
    /**
     * 这里定义了类似于SpringMVC用法的方法，就可以进行RESTful方式的调用了
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/item/{id}")
    Item queryItemById(@PathVariable("id") Long id);
}
