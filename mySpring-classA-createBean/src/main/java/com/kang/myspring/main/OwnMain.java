package com.kang.myspring.main;

import com.kang.myspring.api.OwnService;
import com.kang.myspring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description: 创建Spring创建普通Bean对象
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class OwnMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        //创建的是OwnServiceImpl原始对象
        OwnService ownService = applicationContext.getBean(OwnService.class);
        ownService.helloOwn();;
    }
}