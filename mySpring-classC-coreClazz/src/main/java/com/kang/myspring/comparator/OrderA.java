package com.kang.myspring.comparator;

import org.springframework.core.Ordered;

/**
 * User:
 * Description:
 * Date: 2022-08-16
 * Time: 23:23
 */
public class OrderA  implements Ordered {

    @Override
    public int getOrder() {
        return 3;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
