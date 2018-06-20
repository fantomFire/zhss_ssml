package com.zhsss.zhss_ssml.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.zhsss.zhss_ssml.di.module.RegistActivityModule;
import com.zhsss.zhss_ssml.mvp.ui.activity.RegistActivityActivity;

import dagger.Component;

@ActivityScope
@Component(modules = RegistActivityModule.class, dependencies = AppComponent.class)
public interface RegistActivityComponent {
    void inject(RegistActivityActivity activity);
}