package com.willkernel.loginmvpdemo.module.entities;

/**
 * Created by willkernel
 * on 2019/3/8.
 */
public class User {
    public String name;
    public String pwd;

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
