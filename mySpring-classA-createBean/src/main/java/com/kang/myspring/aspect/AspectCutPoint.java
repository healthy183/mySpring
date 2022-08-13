package com.kang.myspring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * User:
 * Description:
 * Date: 2022-08-11
 * Time: 23:48
 */
@Aspect
@Component
public class AspectCutPoint {

    @Before("execution(* org.kang.myspring.aspectImpl.*.*(..))")
    public void aspectBefore(){
        System.out.println("this aspectBefore!");
    }

   /* @Pointcut("execution(* org.kang.myspring.aspectImpl.*.*(..))")
    public void logService(){
    }
    *//**
     * 环绕通知打印出入堆栈,统一处理服务异常
     * @param joinPoint
     *//*
    @Around("logService()")
    public  void doAroudLog(ProceedingJoinPoint joinPoint) {
        try {
         System.out.println("this doAroudLog before!");
            joinPoint.proceed();
            System.out.println("this doAroudLog after!");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }*/
}
