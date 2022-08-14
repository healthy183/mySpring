package com.kang.enums;

/**
 * User:
 * Description:
 * Date: 2022-08-13
 * Time: 22:29
 */
public enum ScopeEnums {

    PROTOTYPE("protoType"),  // 原形
    SINGLETON("singleton");  // 单例

    private String value;

   private ScopeEnums(String value) {
       this.value = value;
    }

    public String getValue() {
        return value;
    }

}
