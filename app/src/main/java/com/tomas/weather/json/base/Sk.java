package com.tomas.weather.json.base;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tomas on 2016/10/27.
 */
public class Sk {

    String temp;
    @SerializedName("wind_direction")
    String windDirection;
    @SerializedName("wind_strength")
    String windStrength;
    String humidity;
    String time;

}
