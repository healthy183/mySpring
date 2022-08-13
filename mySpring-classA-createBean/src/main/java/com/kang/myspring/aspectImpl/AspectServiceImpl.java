package com.kang.myspring.aspectImpl;

import com.kang.myspring.api.AspectService;
import com.kang.myspring.api.DependService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User:
 * Description:
 * Date: 2022-08-11
 * Tim: 23:47
 */
@Service
public class AspectServiceImpl  implements AspectService {

    @Autowired
    private DependService dependService;

    /**
     * AspectCutPoint中定义了该类的后置通知方法
     */
    @Override
    public void helloAspect() {
        System.out.println("helloAspect");
    }
}
