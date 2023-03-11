package com.lqj.factory.simplefactory.pizzastore.pizza;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 14:24
 * @Description:
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {

        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }

}
