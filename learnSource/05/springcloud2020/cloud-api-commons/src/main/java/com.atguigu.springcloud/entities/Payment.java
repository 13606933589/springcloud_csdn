package com.atguigu.springcloud.entities;/**
 * 2020/5/22.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @User Administrator
 * @Date 2020/5/22 11:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
