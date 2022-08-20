package com.kang.myspring.beanfactory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * User:
 * Description:  KangBeanServiceImpl的创建跟普通@Bean不一样
 * 只会经过初始化后，其他Spring的生命周期步骤是不会经过的，比如依赖注入。
 * Date: 2022-08-19
 * Time: 23:36
 */
@Component
public class KangBeanFactory implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
       return  new KangBeanServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return KangBeanServiceImpl.class;
    }
}
