package com.atguigu.springcloud.dao;/**
 * 2020/5/22.
 */

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/22 15:29
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
