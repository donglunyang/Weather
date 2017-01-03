package com.tomas.weather.json.base;

/**
 * Created by tomas on 2016/10/24.
 */
public class FutureDayItem {

    String temperature;
    String weather;
    WeatherId weather_id;
    String wind;
    String week;
    String date;

    public String getTemperature() {
        return temperature;
    }

    public String getWeather() {
        return weather;
    }

    public WeatherId getWeather_id() {
        return weather_id;
    }

    public String getWind() {
        return wind;
    }

    public String getWeek() {
        return week;
    }

    public String getDate() {
        return date;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setWeather_id(WeatherId weather_id) {
        this.weather_id = weather_id;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
