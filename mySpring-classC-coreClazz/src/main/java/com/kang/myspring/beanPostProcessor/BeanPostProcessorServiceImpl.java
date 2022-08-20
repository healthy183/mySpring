package com.kang.myspring.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * User:
 * Description:
 * Date: 2022-08-16
 * Time: 23:56
 */
@Component
@Lazy
public class BeanPostProcessorServiceImpl {

    public void helloWorld(){
        System.out.println("this is BeanPostProcessorServiceImpl");
    }


}
