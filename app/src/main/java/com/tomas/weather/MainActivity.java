package com.tomas.weather;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tomas.weather.http.HttpRequest;
import com.tomas.weather.json.base.FutureDayHoursItem;
import com.tomas.weather.json.base.FutureDayItem;
import com.tomas.weather.json.base.FutureDayItemTest;
import com.tomas.weather.json.base.Sk;
import com.tomas.weather.json.base.TodayItem;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        String jsonString = "{\"future\":{\n" +
//                "\t\t\t\"day_20161024\":{\n" +
//                "\t\t\t\t\"temperature\":\"19℃~24℃\",\n" +
//                "\t\t\t\t\"weather\":\"阴转小雨\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"02\",\n" +
//                "\t\t\t\t\t\"fb\":\"07\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"东北风微风\",\n" +
//                "\t\t\t\t\"week\":\"星期一\",\n" +
//                "\t\t\t\t\"date\":\"20161024\"\n" +
//                "\t\t\t},\n" +
//                "\t\t\t\"day_20161025\":{\n" +
//                "\t\t\t\t\"temperature\":\"20℃~25℃\",\n" +
//                "\t\t\t\t\"weather\":\"阴转多云\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"02\",\n" +
//                "\t\t\t\t\t\"fb\":\"01\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"北风3-4 级\",\n" +
//                "\t\t\t\t\"week\":\"星期二\",\n" +
//                "\t\t\t\t\"date\":\"20161025\"\n" +
//                "\t\t\t},\n" +
//                "\t\t\t\"day_20161026\":{\n" +
//                "\t\t\t\t\"temperature\":\"21℃~27℃\",\n" +
//                "\t\t\t\t\"weather\":\"多云转阴\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"01\",\n" +
//                "\t\t\t\t\t\"fb\":\"02\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"北风微风\",\n" +
//                "\t\t\t\t\"week\":\"星期三\",\n" +
//                "\t\t\t\t\"date\":\"20161026\"\n" +
//                "\t\t\t},\n" +
//                "\t\t\t\"day_20161027\":{\n" +
//                "\t\t\t\t\"temperature\":\"20℃~27℃\",\n" +
//                "\t\t\t\t\"weather\":\"多云转阴\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"01\",\n" +
//                "\t\t\t\t\t\"fb\":\"02\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"南风微风\",\n" +
//                "\t\t\t\t\"week\":\"星期四\",\n" +
//                "\t\t\t\t\"date\":\"20161027\"\n" +
//                "\t\t\t},\n" +
//                "\t\t\t\"day_20161028\":{\n" +
//                "\t\t\t\t\"temperature\":\"17℃~24℃\",\n" +
//                "\t\t\t\t\"weather\":\"阵雨\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"03\",\n" +
//                "\t\t\t\t\t\"fb\":\"03\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"北风3-4 级\",\n" +
//                "\t\t\t\t\"week\":\"星期五\",\n" +
//                "\t\t\t\t\"date\":\"20161028\"\n" +
//                "\t\t\t},\n" +
//                "\t\t\t\"day_20161029\":{\n" +
//                "\t\t\t\t\"temperature\":\"20℃~25℃\",\n" +
//                "\t\t\t\t\"weather\":\"阴转多云\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"02\",\n" +
//                "\t\t\t\t\t\"fb\":\"01\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"北风3-4 级\",\n" +
//                "\t\t\t\t\"week\":\"星期六\",\n" +
//                "\t\t\t\t\"date\":\"20161029\"\n" +
//                "\t\t\t},\n" +
//                "\t\t\t\"day_20161030\":{\n" +
//                "\t\t\t\t\"temperature\":\"21℃~27℃\",\n" +
//                "\t\t\t\t\"weather\":\"多云转阴\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"01\",\n" +
//                "\t\t\t\t\t\"fb\":\"02\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"北风微风\",\n" +
//                "\t\t\t\t\"week\":\"星期日\",\n" +
//                "\t\t\t\t\"date\":\"20161030\"\n" +
//                "\t\t\t}\n" +
//                "\t\t}\n" +
//                "\t}";

//        List<FutureDayItem> user = new Gson().fromJson(jsonString, new TypeToken<List<FutureDayItem>>() {}.getType());

//        int i = user.size();

//        String jsonString = "{\"future\":{\n" +
//                "\t\t\t\"day_20161024\":{\n" +
//                "\t\t\t\t\"temperature\":\"19℃~24℃\",\n" +
//                "\t\t\t\t\"weather\":\"阴转小雨\",\n" +
//                "\t\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\t\"fa\":\"02\",\n" +
//                "\t\t\t\t\t\"fb\":\"07\"\n" +
//                "\t\t\t\t},\n" +
//                "\t\t\t\t\"wind\":\"东北风微风\",\n" +
//                "\t\t\t\t\"week\":\"星期一\",\n" +
//                "\t\t\t\t\"date\":\"20161024\"\n" +
//                "\t\t\t}\n" +
//                "\t\t\t\n" +
//                "}\n" +
//                "}";
//
//
//
//        FutureDayItemTest test = new Gson().fromJson(jsonString, FutureDayItemTest.class);
//
//        Map<String, FutureDayItem> future = test.getFuture();
//
//        for (Map.Entry<String, FutureDayItem> item:future.entrySet()){
//            System.out.println("key:"+item.getKey());
//            System.out.println(item.getValue().toString());
//        }

//        String jsonString2 = "{\"temp\":\"23\",\"wind_direction\":\"东南风\",\"wind_strength\":\"1级\",\"humidity\":\"71%\",\"time\":\"12:44\"}";
//
//        Sk sk = new Gson().fromJson(jsonString2, Sk.class);
//
//        System.out.println("sk:" + sk.toString());

//        String jsonString3 = "{\n" +
//                "\t\t\t\"temperature\":\"19℃~24℃\",\n" +
//                "\t\t\t\"weather\":\"阴转小雨\",\n" +
//                "\t\t\t\"weather_id\":{\n" +
//                "\t\t\t\t\"fa\":\"02\",\n" +
//                "\t\t\t\t\"fb\":\"07\"\n" +
//                "\t\t\t},\n" +
//                "\t\t\t\"wind\":\"东北风微风\",\n" +
//                "\t\t\t\"week\":\"星期一\",\n" +
//                "\t\t\t\"city\":\"杭州\",\n" +
//                "\t\t\t\"date_y\":\"2016年10月24日\",\n" +
//                "\t\t\t\"dressing_index\":\"舒适\",\n" +
//                "\t\t\t\"dressing_advice\":\"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。\",\n" +
//                "\t\t\t\"uv_index\":\"最弱\",\n" +
//                "\t\t\t\"comfort_index\":\"\",\n" +
//                "\t\t\t\"wash_index\":\"不宜\",\n" +
//                "\t\t\t\"travel_index\":\"较适宜\",\n" +
//                "\t\t\t\"exercise_index\":\"较适宜\",\n" +
//                "\t\t\t\"drying_index\":\"\"\n" +
//                "\t\t}";
//
//        TodayItem todayItem = new Gson().fromJson(jsonString3, TodayItem.class);
//
//        System.out.println("todayItem:" + todayItem.toString());


//        String jsonString5 = "{\n" +
//                "\t\t\t\"weatherid\":\"07\",\n" +
//                "\t\t\t\"weather\":\"小雨\",\n" +
//                "\t\t\t\"temp1\":\"19\",\n" +
//                "\t\t\t\"temp2\":\"18\",\n" +
//                "\t\t\t\"sh\":\"05\",\n" +
//                "\t\t\t\"eh\":\"08\",\n" +
//                "\t\t\t\"date\":\"20161027\",\n" +
//                "\t\t\t\"sfdate\":\"20161027050000\",\n" +
//                "\t\t\t\"efdate\":\"20161027080000\"\n" +
//                "\t\t}";
//
//        FutureDayHoursItem hours = new Gson().fromJson(jsonString5, FutureDayHoursItem.class);
//
//        System.out.println("hours:" + hours.toString());

//        HttpRequest httpRequest = new HttpRequest();
//        httpRequest.getWeatherHttp();

    }

}
