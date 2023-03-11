package com.lqj.factory.factorymethod.pizzastore.order;

import com.lqj.factory.factorymethod.pizzastore.pizza.*;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 16:42
 * @Description:
 */
public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
