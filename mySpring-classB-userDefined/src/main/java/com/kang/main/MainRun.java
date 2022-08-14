package com.kang.main;

import com.kang.service.AppConfig;
import com.kang.service.UserService;
import com.kang.service.UserServiceImpl;
import com.kang.spring.KangApplicationContext;

/**
 * User:
 * Description:
 * Date: 2022-08-13
 * Time: 21:56
 */
public class MainRun {

    public static void main(String[] args) {

        KangApplicationContext kangApplicationContext
                = new KangApplicationContext(AppConfig.class);

        UserService userService = (UserService)
                kangApplicationContext.getBean("userServiceImpl");
        userService.helloWorld();
    }
}
