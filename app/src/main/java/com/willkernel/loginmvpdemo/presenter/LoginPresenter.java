package com.willkernel.loginmvpdemo.presenter;

/**
 * Created by willkernel
 * on 2019/3/8.
 */
public interface LoginPresenter {
    void login(String name, String pwd);
    void onDestroy();
}
