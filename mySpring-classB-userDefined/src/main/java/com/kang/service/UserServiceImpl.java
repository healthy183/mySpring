package com.kang.service;

import com.kang.spring.Component;
import com.kang.spring.KangValue;
import com.kang.spring.Lazy;
import com.kang.spring.Scope;

/**
 * User:
 * Description:
 * Date: 2022-08-13
 * Time: 22:03
 */
@Lazy
@Scope
@Component
public class UserServiceImpl implements UserService {

    @KangValue("kang")
    private String userName;

    @Override
    public void helloWorld(){
        System.out.println("hello world:"+userName);
    }
}
