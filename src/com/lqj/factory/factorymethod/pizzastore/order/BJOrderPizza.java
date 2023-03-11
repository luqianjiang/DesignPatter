package com.lqj.factory.factorymethod.pizzastore.order;

import com.lqj.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.lqj.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.lqj.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 16:42
 * @Description:
 */
public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
