package com.gipl.samplemvvm.ui.login;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.gipl.samplemvvm.R;
import com.gipl.samplemvvm.databinding.LayoutLoginBinding;
import com.gipl.samplemvvm.ui.base.BaseActivity;
import com.gipl.samplemvvm.ui.modles.Response;
import com.gipl.samplemvvm.utility.DialogUtility;

import javax.inject.Inject;

/**
 * Creted by User on 05-Jan-19
 */
public class LoginActivity extends BaseActivity<LayoutLoginBinding,LoginViewModel> {

    @Inject
    LoginViewModel loginViewModel;

    @Override
    public int getBindingVariable() {
        return com.gipl.samplemvvm.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_login;
    }


    @Override
    public LoginViewModel getViewModel() {
        return loginViewModel;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutLoginBinding layoutLoginBinding = getViewDataBinding();
        loginViewModel.getResponseMutableLiveData().observe(this, this::processLoginRes);
        loginViewModel.getLoginSuccessRes().observe(this,this::processLoginSuccess);
        layoutLoginBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void processLoginSuccess(Boolean aBoolean) {
        if (aBoolean){
            DialogUtility.showToast(this,"Login Success move next activity");
        }
    }

    private void processLoginRes(Response response) {
        switch (response.status){
            case LOADING:
                break;
            case SUCCESS:
                //navigate to next activity
                break;
            case ERROR:
                DialogUtility.showToast(this,"Error");
                break;
        }
    }


}
