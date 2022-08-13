package com.kang.myspring.initbean;

import com.kang.myspring.javaBean.SimpleBean;
import com.kang.myspring.javaBean.InferBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * User:
 * Description: springBean创建的推论构造方法
 * Date: 2022-08-13
 * Time: 0:03
 */
@Service
@Lazy
public class InferConstruct {

    @Autowired
    private InferBean inferBean;

    private SimpleBean simpleBean;

    /**
     * 默认使用构造方法，无@Autowired下优先级最高
     */
    private  InferConstruct(){
        System.out.println("no arg construct");
    }

    /**
     * inferBean是springBean，如果只有这个构造方法则执行
     */
    @Autowired
    private  InferConstruct(InferBean inferBean){
        this.inferBean = inferBean;
        System.out.println("@Autowired inferBean construct");
    }

    /**
     * 如果上面没有@Autowired，则报simpleBean不是springBean，报异常
     */
    public InferConstruct(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
        System.out.println("simpleBean construct");
    }

    /**
     * 如果上面构造方法方法没有@Autowired，则报simpleBean不是springBean，报异常
     */
    /*public InferConstruct(InferBean inferBean, SimpleBean simpleBean) {
        System.out.println("inferBean&simpleBean construct ");
        this.inferBean = inferBean;
        this.simpleBean = simpleBean;
    }*/
}
