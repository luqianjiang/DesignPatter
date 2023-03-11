package com.lqj.factory.simplefactory.pizzastore.pizza;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 14:26
 * @Description:
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {

        System.out.println(" 给希腊披萨 准备原材料 ");
    }

}
