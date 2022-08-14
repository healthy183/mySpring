package com.kang.service;

import com.kang.spring.BeanPostProcessor;
import com.kang.spring.Component;
import com.kang.spring.ComponentScan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * User:
 * Description: 模拟spring创建bean后执行aop逻辑
 * Date: 2022-08-14
 * Time: 12:21
 */

@Component
public class AOPBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {

        if (beanName.equals("userServiceImpl")) {
            Object proxyInstance = Proxy.newProxyInstance(AOPBeanPostProcessor.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    // 切面
                    System.out.println("切面逻辑");

                    return method.invoke(bean, args);
                }
            });

            return proxyInstance;
        }





        return bean;
    }
}
