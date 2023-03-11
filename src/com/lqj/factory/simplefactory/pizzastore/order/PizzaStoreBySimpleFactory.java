package com.lqj.factory.simplefactory.pizzastore.order;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 15:08
 * @Description:
 */
public class PizzaStoreBySimpleFactory {
    public static void main(String[] args) {
        //使用简单工厂模式
        new OrderPizzaBySimpleFactory(new SimpleFactory());
        System.out.println("退出程序");
    }

}
