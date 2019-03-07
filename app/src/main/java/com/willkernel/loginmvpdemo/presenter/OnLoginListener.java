package com.willkernel.loginmvpdemo.presenter;

/**
 * Created by willkernel
 * on 2019/3/8.
 */
public interface OnLoginListener {
    void onNameError();
    void onPwdError();
    void onSuccess();
}
