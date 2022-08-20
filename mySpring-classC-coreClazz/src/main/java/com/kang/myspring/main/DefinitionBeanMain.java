package com.kang.myspring.main;

import com.kang.myspring.config.AppConfig;
import com.kang.myspring.definition.DefinitionServiceImpl;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description:
 * Date: 2022-08-14
 * Time: 17:12
 */
public class DefinitionBeanMain {

    public static void main(String[] args) {


        // 最简单DefaultListableBeanFactory手动注册bean进入容器
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(DefinitionServiceImpl.class);
        defaultListableBeanFactory.registerBeanDefinition("definitionServiceImplAAA",beanDefinition);

        DefinitionServiceImpl definitionServiceImplAAA =
                (DefinitionServiceImpl) defaultListableBeanFactory.getBean("definitionServiceImplAAA");
        System.out.println(definitionServiceImplAAA);


        // 手动注册bean进入容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AbstractBeanDefinition annotationbeanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        annotationbeanDefinition.setBeanClass(DefinitionServiceImpl.class);
        annotationbeanDefinition.setScope("prototype");
        //annotationbeanDefinition.setInitMethodName(); // 初始化方法
        //annotationbeanDefinition.setLazyInit(true);   // 是否懒加载
        applicationContext.registerBeanDefinition("definitionServiceImpl",annotationbeanDefinition);

        DefinitionServiceImpl definitionServiceImpl = applicationContext.getBean(DefinitionServiceImpl.class);
        DefinitionServiceImpl definitionServiceImpl2 = applicationContext.getBean(DefinitionServiceImpl.class);
        System.out.println(definitionServiceImpl);
        System.out.println(definitionServiceImpl2);

        //通过AnnotatedBeanDefinitionReader注册方式(更方便)
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
