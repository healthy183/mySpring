package com.kang.myspring.initbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * User:
 * Description: springBean加载流程
 * Date: 2022-08-12
 * Time: 23:35
 */
@Service
@Lazy  //测试的时候记得注释
public class InitBeanSort implements BeanNameAware,
                                        BeanClassLoaderAware,
                                        BeanFactoryAware,
                                        InitializingBean {

    /**
     * 构造方法
     */
    private InitBeanSort(){
        System.out.println("1");
    }

    /**
     *SimpleBean如果不是springbean则报UnsatisfiedDependencyException异常
     *No qualifying bean of type 'org.kang.myspring.javaBean.SimpleBean
     */
    /*private InitbeanDemo(SimpleBean simpleBean){
        System.out.println("SimpleBean1");
    }*/

    /**
     * BeanNameAware接口方法
     */
    @Override
    public void setBeanName(String s) {
        System.out.println("2");
    }

    /**
     *  BeanClassLoaderAware接口方法
     * @param classLoader
     */
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("3");
    }

    /**
     * BeanFactoryAware接口方法
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4");
    }

    /**
     * 预加载方法
     */
    @PostConstruct
    public void postConstructMethod(){
        System.out.println("5");
    }

    /**  创建bean的后置方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6");
    }

    public void doSth(){
        System.out.println("doSth");
    }
}
