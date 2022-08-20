package com.kang.myspring.config;

import com.kang.myspring.converter.StringToOrderConverter;
import com.kang.myspring.editor.StringToUserPropertyEditor;
import com.kang.myspring.editor.User;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ConversionServiceFactoryBean;

import javax.annotation.Resource;
import java.beans.PropertyEditor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * User:
 * Description:
 * Date: 2022-08-11
 * Time: 23:23
 */
@PropertySource("classpath:spring.properties")
@Configuration //添加则表示spring最后调用的是AppConfigProxy(代理类).appConfig.doSth()
@ComponentScan("com.kang.myspring")
@EnableAspectJAutoProxy(proxyTargetClass=true)  //proxyTargetClass=true 启用cglib则生成代理对象的target为懒加载
public class AppConfig {

    @Bean
    public ApplicationListener applicationListener() {
        return new ApplicationListener() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.out.println("接收到了一个事件");
            }
        };
    }

    /**
     * @return 自定义转换器PropertyEditor
     */
    @Bean
    public CustomEditorConfigurer customEditorConfigurer() {
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();
        // 表示StringToUserPropertyEditor可以将String转化成User类型，在Spring源码中，如果发现当前对象是String，而需要的类型是User，就会使用该PropertyEditor来做类型转化
        propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
        customEditorConfigurer.setCustomEditors(propertyEditorMap);
        return customEditorConfigurer;
    }

    @Bean
    public ConversionServiceFactoryBean conversionService() {
        ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
        conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToOrderConverter()));
        return conversionServiceFactoryBean;
    }

}
