package com.kang.myspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * User:
 * Description:
 * Date: 2022-08-11
 * Time: 23:23
 */
@Configuration //添加则表示spring最后调用的是AppConfigProxy(代理类).appConfig.doSth()
@ComponentScan("org.kang.myspring")
@EnableAspectJAutoProxy(proxyTargetClass=true)  //proxyTargetClass=true 启用cglib则生成代理对象的target为懒加载
public class AppConfig {

}
