package com.tomas.weather.http;

import com.google.gson.Gson;
import com.tomas.weather.json.WeatherResponse;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by tomas on 2016/10/27.
 */
public class HttpRequest {

    public void getWeatherHttp() {
        String url = "http://v.juhe.cn/weather/index";

        OkHttpUtils.get().url(url)
                .addParams("cityname", "杭州")
                .addParams("key", "68ec6a4b80beb7e5d0bc786e3cb14ffd")
                .build()
                .execute(new WeatherResponseCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(WeatherResponse response, int id) {

                    }
                });
    }



}
