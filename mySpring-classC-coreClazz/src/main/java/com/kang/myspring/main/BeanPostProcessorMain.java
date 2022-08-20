package com.kang.myspring.main;

import com.kang.myspring.beanPostProcessor.BeanPostProcessorServiceImpl;
import com.kang.myspring.config.AppConfig;
import com.kang.myspring.editor.EditorServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description:
 * Date: 2022-08-16
 * Time: 23:59
 */
public class BeanPostProcessorMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanPostProcessorServiceImpl beanPostProcessorService =  context.getBean(BeanPostProcessorServiceImpl.class);
        beanPostProcessorService.helloWorld();

    }
}
