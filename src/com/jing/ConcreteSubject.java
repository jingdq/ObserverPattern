package com.jing;

/**
 * Created by jingdongqi on 7/5/15.
 */
public class ConcreteSubject extends  Subject {

    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
