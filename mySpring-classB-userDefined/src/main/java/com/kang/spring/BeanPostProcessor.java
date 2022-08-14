package com.kang.spring;

/**
 * User:
 * Description:
 * Date: 2022-08-14
 * Time: 12:03
 */
public interface BeanPostProcessor {

    default Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean;
    }

    default Object postProcessAfterInitialization(Object bean, String beanName) {
        return bean;
    }
}
