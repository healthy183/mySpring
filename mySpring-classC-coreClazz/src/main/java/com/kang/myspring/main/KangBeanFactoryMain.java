package com.kang.myspring.main;

import com.kang.myspring.beanfactory.KangBeanServiceImpl;
import com.kang.myspring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description:
 * Date: 2022-08-19
 * Time: 23:38
 */
public class KangBeanFactoryMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        KangBeanServiceImpl bean = context.getBean(KangBeanServiceImpl.class);
        bean.helloWorld();
    }
}
