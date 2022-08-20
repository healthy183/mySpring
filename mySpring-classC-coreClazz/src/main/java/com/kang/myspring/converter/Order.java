package com.kang.myspring.converter;

/**
 * User:
 * Description:
 * Date: 2022-08-15
 * Time: 23:08
 */
public class Order implements  java.io.Serializable {

    private static final long serialVersionUID = 5182502836504323900L;
    private String name;

    public Order() {
    }

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                '}';
    }
}
