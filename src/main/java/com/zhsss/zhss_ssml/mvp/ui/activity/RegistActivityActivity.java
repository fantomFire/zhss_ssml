package com.zhsss.zhss_ssml.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.zhsss.zhss_ssml.di.component.DaggerRegistActivityComponent;
import com.zhsss.zhss_ssml.di.module.RegistActivityModule;
import com.zhsss.zhss_ssml.mvp.contract.RegistActivityContract;
import com.zhsss.zhss_ssml.mvp.presenter.RegistActivityPresenter;

import com.zhsss.zhss_ssml.R;


import static com.jess.arms.utils.Preconditions.checkNotNull;


public class RegistActivityActivity extends BaseActivity<RegistActivityPresenter> implements RegistActivityContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerRegistActivityComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .registActivityModule(new RegistActivityModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_regist; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }
}
