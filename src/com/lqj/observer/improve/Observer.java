package com.lqj.observer.improve;

/**
 * @Author luqianjiang
 * @Date 2023/3/8 23:45
 * @Description:
 */
//观察者接口，由观察者来实现
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
