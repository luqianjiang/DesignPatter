package com.lqj.factory.simplefactory.pizzastore.order;

import com.lqj.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.lqj.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.lqj.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.lqj.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 14:56
 * @Description:
 */
public class SimpleFactory {
    //更加orderType 返回对应的Pizza 对象
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
