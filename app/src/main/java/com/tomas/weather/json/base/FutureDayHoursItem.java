package com.tomas.weather.json.base;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tomas on 2016/10/27.
 */
public class FutureDayHoursItem {

    @SerializedName("weatherid")
    String weatherId;
    String weather;
    @SerializedName("temp1")
    String highTemp;
    @SerializedName("temp2")
    String lowTemp;
    @SerializedName("sh")
    String startHour;
    @SerializedName("eh")
    String endHour;
    String date;
    @SerializedName("sfdate")
    String startDate;
    @SerializedName("efdate")
    String endDate;
}
