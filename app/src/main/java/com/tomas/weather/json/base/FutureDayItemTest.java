package com.tomas.weather.json.base;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created by tomas on 2016/10/24.
 */
public class FutureDayItemTest {

//    String jsonString = "{\"future\":{\n" +
//            "\t\t\t\"day_20161024\":{\n" +
//            "\t\t\t\t\"temperature\":\"19℃~24℃\",\n" +
//            "\t\t\t\t\"weather\":\"阴转小雨\",\n" +
//            "\t\t\t\t\"weather_id\":{\n" +
//            "\t\t\t\t\t\"fa\":\"02\",\n" +
//            "\t\t\t\t\t\"fb\":\"07\"\n" +
//            "\t\t\t\t},\n" +
//            "\t\t\t\t\"wind\":\"东北风微风\",\n" +
//            "\t\t\t\t\"week\":\"星期一\",\n" +
//            "\t\t\t\t\"date\":\"20161024\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t\"day_20161025\":{\n" +
//            "\t\t\t\t\"temperature\":\"20℃~25℃\",\n" +
//            "\t\t\t\t\"weather\":\"阴转多云\",\n" +
//            "\t\t\t\t\"weather_id\":{\n" +
//            "\t\t\t\t\t\"fa\":\"02\",\n" +
//            "\t\t\t\t\t\"fb\":\"01\"\n" +
//            "\t\t\t\t},\n" +
//            "\t\t\t\t\"wind\":\"北风3-4 级\",\n" +
//            "\t\t\t\t\"week\":\"星期二\",\n" +
//            "\t\t\t\t\"date\":\"20161025\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t\"day_20161026\":{\n" +
//            "\t\t\t\t\"temperature\":\"21℃~27℃\",\n" +
//            "\t\t\t\t\"weather\":\"多云转阴\",\n" +
//            "\t\t\t\t\"weather_id\":{\n" +
//            "\t\t\t\t\t\"fa\":\"01\",\n" +
//            "\t\t\t\t\t\"fb\":\"02\"\n" +
//            "\t\t\t\t},\n" +
//            "\t\t\t\t\"wind\":\"北风微风\",\n" +
//            "\t\t\t\t\"week\":\"星期三\",\n" +
//            "\t\t\t\t\"date\":\"20161026\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t\"day_20161027\":{\n" +
//            "\t\t\t\t\"temperature\":\"20℃~27℃\",\n" +
//            "\t\t\t\t\"weather\":\"多云转阴\",\n" +
//            "\t\t\t\t\"weather_id\":{\n" +
//            "\t\t\t\t\t\"fa\":\"01\",\n" +
//            "\t\t\t\t\t\"fb\":\"02\"\n" +
//            "\t\t\t\t},\n" +
//            "\t\t\t\t\"wind\":\"南风微风\",\n" +
//            "\t\t\t\t\"week\":\"星期四\",\n" +
//            "\t\t\t\t\"date\":\"20161027\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t\"day_20161028\":{\n" +
//            "\t\t\t\t\"temperature\":\"17℃~24℃\",\n" +
//            "\t\t\t\t\"weather\":\"阵雨\",\n" +
//            "\t\t\t\t\"weather_id\":{\n" +
//            "\t\t\t\t\t\"fa\":\"03\",\n" +
//            "\t\t\t\t\t\"fb\":\"03\"\n" +
//            "\t\t\t\t},\n" +
//            "\t\t\t\t\"wind\":\"北风3-4 级\",\n" +
//            "\t\t\t\t\"week\":\"星期五\",\n" +
//            "\t\t\t\t\"date\":\"20161028\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t\"day_20161029\":{\n" +
//            "\t\t\t\t\"temperature\":\"20℃~25℃\",\n" +
//            "\t\t\t\t\"weather\":\"阴转多云\",\n" +
//            "\t\t\t\t\"weather_id\":{\n" +
//            "\t\t\t\t\t\"fa\":\"02\",\n" +
//            "\t\t\t\t\t\"fb\":\"01\"\n" +
//            "\t\t\t\t},\n" +
//            "\t\t\t\t\"wind\":\"北风3-4 级\",\n" +
//            "\t\t\t\t\"week\":\"星期六\",\n" +
//            "\t\t\t\t\"date\":\"20161029\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t\"day_20161030\":{\n" +
//            "\t\t\t\t\"temperature\":\"21℃~27℃\",\n" +
//            "\t\t\t\t\"weather\":\"多云转阴\",\n" +
//            "\t\t\t\t\"weather_id\":{\n" +
//            "\t\t\t\t\t\"fa\":\"01\",\n" +
//            "\t\t\t\t\t\"fb\":\"02\"\n" +
//            "\t\t\t\t},\n" +
//            "\t\t\t\t\"wind\":\"北风微风\",\n" +
//            "\t\t\t\t\"week\":\"星期日\",\n" +
//            "\t\t\t\t\"date\":\"20161030\"\n" +
//            "\t\t\t}\n" +
//            "\t\t}\n" +
//            "\t}";

//    List<FutureDayItem> user = new Gson().fromJson(jsonString, new TypeToken<List<FutureDayItem>>() {}.getType());
//
//    int i = user.size();

    private Map<String,FutureDayItem> future;

    public Map<String, FutureDayItem> getFuture() {
        return future;
    }
}
