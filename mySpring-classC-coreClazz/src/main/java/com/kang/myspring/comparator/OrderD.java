package com.kang.myspring.comparator;

import org.springframework.core.annotation.Order;

/**
 * User:
 * Description:
 * Date: 2022-08-16
 * Time: 23:23
 */
@Order(2)
public class OrderD {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
