package com.tomas.weather.json;

import com.tomas.weather.json.base.FutureDayItem;
import com.tomas.weather.json.base.Sk;
import com.tomas.weather.json.base.TodayItem;

import java.util.Map;

/**
 * Created by tomas on 2016/10/27.
 */
public class Result {
    private Sk sk;
    private TodayItem today;
    private Map<String,FutureDayItem> future;
}
