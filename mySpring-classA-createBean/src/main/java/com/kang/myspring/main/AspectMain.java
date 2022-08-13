package com.kang.myspring.main;
import com.kang.myspring.api.AspectService;
import com.kang.myspring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description: 暂时spring创建动态代理对象
 * Date: 2022-08-11
 * Time: 23:55
 */
public class AspectMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // 由于AspectService被aop了，所以这里拿出来的是AspectService的代理对象AspectService$proxy
        AspectService aspectService =
                // applicationContext.getBean(AspectService.class);
                (AspectService) applicationContext.getBean("aspectServiceImpl");
        // 这里是实际是AspectService$proxy.aspectService.helloAspect();
        // Spring 5.3.22版本中，需要注意
        // @EnableAspectJAutoProxy.proxyTargetClass默认是false，使用JDK动态代理机制，生成代理对象的target为预加载
        // @EnableAspectJAutoProxy(proxyTargetClass=true) 启用cglib则生成代理对象的target为懒加载
        aspectService.helloAspect();
    }
}
