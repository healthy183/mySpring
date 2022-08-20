package com.kang.myspring.main;

import com.kang.myspring.config.AppConfig;
import com.kang.myspring.converter.ConverterServiceImpl;
import com.kang.myspring.editor.EditorServiceImpl;
import com.kang.myspring.editor.StringToUserPropertyEditor;
import com.kang.myspring.editor.User;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User:
 * Description: ConverterServiceImpl
 * Date: 2022-08-16
 * Time: 23:00
 */
public class ConverterMain {

    public static void main(String[] args) {
        // java代码实现转换
        StringToUserPropertyEditor propertyEditor = new StringToUserPropertyEditor();
        propertyEditor.setAsText("javaOne");
        User value = (User) propertyEditor.getValue();
        System.out.println(value);

        SimpleTypeConverter typeConverter = new SimpleTypeConverter();
        typeConverter.registerCustomEditor(User.class, new StringToUserPropertyEditor());
        User value2 = typeConverter.convertIfNecessary("javaTwo", User.class);
        System.out.println(value2);

        //spring内部实现转换
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConverterServiceImpl contextBean =  context.getBean(ConverterServiceImpl.class);
        contextBean.helloWorld();
    }
}
