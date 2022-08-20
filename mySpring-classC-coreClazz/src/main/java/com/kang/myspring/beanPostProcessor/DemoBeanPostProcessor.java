package com.kang.myspring.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * User:
 * Description: bean初始化前后的处理器
 * Date: 2022-08-16
 * Time: 23:56
 */
@Component
public class DemoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("beanPostProcessorServiceImpl".equals(beanName)) {
            System.out.println("beanPostProcessorServiceImpl 初始化前....");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("beanPostProcessorServiceImpl".equals(beanName)) {
            System.out.println("beanPostProcessorServiceImpl 初始化后...");
        }
        return bean;
    }
}
