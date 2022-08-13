package com.kang.myspring.main;

import com.kang.myspring.config.AppConfig;
import com.kang.myspring.initbean.InitBeanSort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description: 展示bean创建流程
 * Date: 2022-08-12
 * Time: 23:41
 */
public class InitBeanMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        InitBeanSort initbean = applicationContext.getBean(InitBeanSort.class);
        initbean.doSth();
    }
}
