package com.willkernel.loginmvpdemo.module;

import com.willkernel.loginmvpdemo.module.entities.User;
import com.willkernel.loginmvpdemo.presenter.OnLoginListener;

/**
 * Created by willkernel
 * on 2019/3/8.
 */
public class LoginModelImpl implements LoginModel {
    @Override
    public void login(User user, OnLoginListener loginListener) {
        if (!user.name.equals("willkernel")) {
            loginListener.onNameError();
            return;
        }
        if (!user.pwd.equals("password")) {
            loginListener.onPwdError();
            return;
        }
        loginListener.onSuccess();

    }
}
