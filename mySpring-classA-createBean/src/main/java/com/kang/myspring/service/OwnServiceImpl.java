package com.kang.myspring.service;

import com.kang.myspring.api.DependService;
import com.kang.myspring.api.OwnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User:
 * Description:
 * Date: 2022-08-11
 * Time: 23:26
 */
@Service
public class OwnServiceImpl  implements OwnService {

    @Autowired
    private DependService dependService;

    @Override
    public void helloOwn() {
        dependService.helloDepend();
    }
}
