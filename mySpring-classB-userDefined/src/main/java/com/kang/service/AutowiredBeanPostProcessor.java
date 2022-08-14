package com.kang.service;

import com.kang.spring.BeanPostProcessor;
import com.kang.spring.Component;
import com.kang.spring.KangValue;

import java.lang.reflect.Field;

/**
 * User:
 * Description: 模拟spring创建bean，执行全局变量赋值
 * Date: 2022-08-14
 * Time: 12:22
 */
@Component
public class AutowiredBeanPostProcessor  implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        for (Field field : bean.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(KangValue.class)) {
                field.setAccessible(true);
                try {
                    field.set(bean, field.getAnnotation(KangValue.class).value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return  bean;
    }
}
