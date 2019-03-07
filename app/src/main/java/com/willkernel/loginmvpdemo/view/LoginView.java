package com.willkernel.loginmvpdemo.view;

/**
 * Created by willkernel
 * on 2019/3/8.
 */
public interface LoginView {
    void showProgress();
    void hideProgress();
    void nameError();
    void pwdError();
    void showSuccess();
}
