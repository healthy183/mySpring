package com.kang.myspring.editor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User:
 * Description:
 * Date: 2022-08-15
 * Time: 23:45
 */
@Component
public class EditorServiceImpl {

    @Value("editor")
    private User user;

    public void helloWorld(){
        System.out.println("hello World "+ user);
    }
}
