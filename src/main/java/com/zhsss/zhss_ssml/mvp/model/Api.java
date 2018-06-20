package com.zhsss.zhss_ssml.mvp.model;

import com.zhsss.zhss_ssml.mvp.model.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {

    public static String BASEURL = "http://sssm.zhonghuass.cn/Api/";
    public static final String SHOUYE = BASEURL + "";
    @GET("Index/index")
    Observable<HomeBean> getHomeData();

}
