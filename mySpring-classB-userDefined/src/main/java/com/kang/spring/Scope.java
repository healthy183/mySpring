package com.kang.spring;

import com.kang.enums.ScopeEnums;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User:
 * Description:
 * Date: 2022-08-13
 * Time: 21:32
 * @author healthy
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Scope {

    String value() default "singleton";
}
