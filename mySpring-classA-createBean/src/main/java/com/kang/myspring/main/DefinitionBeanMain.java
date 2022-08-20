package com.kang.myspring.main;

import com.kang.myspring.config.AppConfig;
import com.kang.myspring.definition.DefinitionServiceImpl;
import com.kang.myspring.initbean.InferConstruct;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * User:
 * Description:
 * Date: 2022-08-14
 * Time: 17:12
 */
public class DefinitionBeanMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // 手动注册bean进入容器
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(DefinitionServiceImpl.class);
        beanDefinition.setScope("prototype");
        applicationContext.registerBeanDefinition("definitionServiceImpl",beanDefinition);

        DefinitionServiceImpl definitionServiceImpl = applicationContext.getBean(DefinitionServiceImpl.class);
        DefinitionServiceImpl definitionServiceImpl2 = applicationContext.getBean(DefinitionServiceImpl.class);
        System.out.println(definitionServiceImpl);
        System.out.println(definitionServiceImpl2);

        //另外一种注册方式(更方便)
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader
                = new AnnotatedBeanDefinitionReader(applicationContext);
        annotatedBeanDefinitionReader.registerBean(DefinitionServiceImpl.class,"definitionServiceImpl2");

        DefinitionServiceImpl definitionServiceImpl3 =
                (DefinitionServiceImpl) applicationContext.getBean("definitionServiceImpl2");
        DefinitionServiceImpl definitionServiceImpl4 =
                (DefinitionServiceImpl) applicationContext.getBean("definitionServiceImpl2");

        System.out.println(definitionServiceImpl3);
        System.out.println(definitionServiceImpl4);

    }
}
