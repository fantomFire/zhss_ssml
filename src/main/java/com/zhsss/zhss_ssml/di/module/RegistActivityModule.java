package com.zhsss.zhss_ssml.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.zhsss.zhss_ssml.mvp.contract.RegistActivityContract;
import com.zhsss.zhss_ssml.mvp.model.RegistActivityModel;


@Module
public class RegistActivityModule {
    private RegistActivityContract.View view;

    /**
     * 构建RegistActivityModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public RegistActivityModule(RegistActivityContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RegistActivityContract.View provideRegistActivityView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    RegistActivityContract.Model provideRegistActivityModel(RegistActivityModel model) {
        return model;
    }
}