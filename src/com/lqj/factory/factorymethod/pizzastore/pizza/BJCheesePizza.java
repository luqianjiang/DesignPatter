package com.lqj.factory.factorymethod.pizzastore.pizza;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 16:37
 * @Description:
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }

}