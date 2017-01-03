package com.tomas.weather.json.base;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tomas on 2016/10/27.
 */
public class TodayItem {
    String temperature;
    String weather;
    @SerializedName("weather_id")
    WeatherId weatherId;
    String wind;
    String week;
    String city;
    @SerializedName("date_y")
    String date;
    @SerializedName("dressing_index")
    String dressing;
    @SerializedName("dressing_advice")
    String dressingAdvice;
    @SerializedName("uv_index")
    String uv;
    @SerializedName("comfort_index")
    String comfort;
    @SerializedName("wash_index")
    String wash;
    @SerializedName("travel_index")
    String travel;
    @SerializedName("exercise_index")
    String exercise;
    @SerializedName("drying_index")
    String drying;
}
