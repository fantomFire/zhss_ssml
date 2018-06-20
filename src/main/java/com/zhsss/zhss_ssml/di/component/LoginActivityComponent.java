package com.zhsss.zhss_ssml.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.zhsss.zhss_ssml.di.module.LoginActivityModule;
import com.zhsss.zhss_ssml.mvp.ui.activity.LoginActivityActivity;

import dagger.Component;

@ActivityScope
@Component(modules = LoginActivityModule.class, dependencies = AppComponent.class)
public interface LoginActivityComponent {
    void inject(LoginActivityActivity activity);


}