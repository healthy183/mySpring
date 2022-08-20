package com.kang.myspring.converter;

import com.kang.myspring.editor.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User:
 * Description:
 * Date: 2022-08-15
 * Time: 23:45
 */
@Component
public class ConverterServiceImpl {

    @Value("orderConverter")
    private Order order;

    public void helloWorld(){
        System.out.println("hello World "+ order);
    }
}
