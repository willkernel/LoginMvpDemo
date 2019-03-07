package com.willkernel.loginmvpdemo.module;

import com.willkernel.loginmvpdemo.module.entities.User;
import com.willkernel.loginmvpdemo.presenter.OnLoginListener;

/**
 * Created by willkernel
 * on 2019/3/8.
 */
public interface LoginModel {
    void login(User user, OnLoginListener loginListener);
}
