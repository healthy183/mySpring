package com.kang.myspring.main;

import com.kang.myspring.api.DependService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * User:
 * Description:
 * Date: 2022-08-14
 * Time: 18:19
 */
public class ScanBeanMain {

    public static void main(String[] args) {

        //手动扫描javaBean
        AnnotationConfigApplicationContext noArgApplicationContext = new AnnotationConfigApplicationContext();
        noArgApplicationContext.refresh();

        ClassPathBeanDefinitionScanner classPathBeanDefinitionScanner
                = new ClassPathBeanDefinitionScanner(noArgApplicationContext);
        int scan = classPathBeanDefinitionScanner.scan("com.kang.myspring.service");
        //DefinitionServiceImpl记得添加@Component
        DependService aspectService = noArgApplicationContext.getBean(DependService.class);
        System.out.println(aspectService);
    }
}
