package com.kang.myspring.main;

import com.kang.myspring.config.AppConfig;
import com.kang.myspring.initbean.InferConstruct;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description: 测试spring推论构造方法
 * Date: 2022-08-13
 * Time: 0:06
 */
public class InferConstructMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        InferConstruct inferConstruct = applicationContext.getBean(InferConstruct.class);
        System.out.println(inferConstruct);
    }
}
