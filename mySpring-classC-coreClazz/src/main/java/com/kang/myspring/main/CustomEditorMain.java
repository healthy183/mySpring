package com.kang.myspring.main;

import com.kang.myspring.api.DependService;
import com.kang.myspring.config.AppConfig;
import com.kang.myspring.converter.StringToOrderConverter;
import com.kang.myspring.editor.EditorServiceImpl;
import com.kang.myspring.editor.StringToUserPropertyEditor;
import com.kang.myspring.editor.User;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description: 自定义转换器
 * Date: 2022-08-15
 * Time: 23:06
 */
public class CustomEditorMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EditorServiceImpl dependService =  context.getBean(EditorServiceImpl.class);
        dependService.helloWorld();
    }
}
