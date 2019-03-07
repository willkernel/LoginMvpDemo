package com.willkernel.loginmvpdemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.willkernel.loginmvpdemo.R;
import com.willkernel.loginmvpdemo.presenter.LoginPresenter;
import com.willkernel.loginmvpdemo.presenter.LoginPresenterImpl;
import com.willkernel.loginmvpdemo.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {
    private static final String TAG = "MainActivity";
    private EditText nameEt;
    private EditText pwdEt;
    private TextView displayTv;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEt = findViewById(R.id.nameEt);
        pwdEt = findViewById(R.id.pwdEt);
        displayTv = findViewById(R.id.displayTv);
        loginPresenter = new LoginPresenterImpl(this);
    }

    public void login(View view) {
        loginPresenter.login(nameEt.getText().toString(), pwdEt.getText().toString());
    }

    @Override
    public void showProgress() {
        displayTv.setText("logining");
    }

    @Override
    public void hideProgress() {
        Log.d(TAG, "hide progress");
    }

    @Override
    public void nameError() {
        displayTv.setText("nameError");
    }

    @Override
    public void pwdError() {
        displayTv.setText("pwdError");
    }

    @Override
    public void showSuccess() {
        displayTv.setText("login success");
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }
}
