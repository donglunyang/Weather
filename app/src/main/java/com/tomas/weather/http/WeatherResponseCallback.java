package com.tomas.weather.http;

import com.google.gson.Gson;
import com.tomas.weather.json.WeatherResponse;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Response;

/**
 * Created by tomas on 2016/10/27.
 */
public abstract class WeatherResponseCallback extends Callback<WeatherResponse> {
    @Override
    public WeatherResponse parseNetworkResponse(Response response, int id) throws Exception {
        String jsonResponse = response.body().string();
        WeatherResponse weatherResponse = new Gson().fromJson(jsonResponse, WeatherResponse.class);
        return weatherResponse;
    }
}
