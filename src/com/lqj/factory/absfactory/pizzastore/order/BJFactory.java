package com.lqj.factory.absfactory.pizzastore.order;

import com.lqj.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.lqj.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.lqj.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 17:25
 * @Description:
 */
//这是工厂子类
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        // TODO Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
