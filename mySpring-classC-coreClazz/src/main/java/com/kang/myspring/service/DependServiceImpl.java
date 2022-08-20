package com.kang.myspring.service;

import com.kang.myspring.api.DependService;
import org.springframework.stereotype.Service;

/**
 * User:
 * Description:
 * Date: 2022-08-11
 * Time: 23:39
 */
@Service
public class DependServiceImpl implements DependService {
    @Override
    public void helloDepend() {
        System.out.println("this is  DependServiceImpl");
    }
}
