package com.lqj.observer.improve;



/**
 * @Author luqianjiang
 * @Date 2023/3/8 23:43
 * @Description:
 */
//接口, 让WeatherData 来实现
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}