package com.willkernel.loginmvpdemo.presenter;

import com.willkernel.loginmvpdemo.module.LoginModel;
import com.willkernel.loginmvpdemo.module.LoginModelImpl;
import com.willkernel.loginmvpdemo.module.entities.User;
import com.willkernel.loginmvpdemo.view.LoginView;

/**
 * Created by willkernel
 * on 2019/3/8.
 */
public class LoginPresenterImpl implements LoginPresenter, OnLoginListener {
    private LoginModelImpl loginModel;
    private LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModelImpl();
    }

    @Override
    public void login(String name, String pwd) {
        if (loginView != null) {
            loginView.showProgress();
        }
        loginModel.login(new User(name, pwd), this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onNameError() {
        if (loginView != null) {
            loginView.nameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPwdError() {
        if (loginView != null) {
            loginView.pwdError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView!=null) {
            loginView.showSuccess();
            loginView.hideProgress();
        }
    }
}
