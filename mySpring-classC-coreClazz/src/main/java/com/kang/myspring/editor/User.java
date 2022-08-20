package com.kang.myspring.editor;

/**
 * User:
 * Description:
 * Date: 2022-08-15
 * Time: 23:08
 */
public class User  implements  java.io.Serializable {

    private static final long serialVersionUID = -3858012441638198910L;

    private String name;

    public User() {
    }

    public User(String name) {
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
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
