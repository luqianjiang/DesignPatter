package com.lqj.factory.absfactory.pizzastore.order;

import com.lqj.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 17:24
 * @Description:
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}

