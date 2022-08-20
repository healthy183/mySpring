package com.kang.myspring.main;

import com.kang.myspring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description: 延时spring事件监控
 * Date: 2022-08-15
 * Time: 23:01
 */
public class ApplicationEventMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.publishEvent("kkk");
    }
}
