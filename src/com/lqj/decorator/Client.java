package com.lqj.decorator;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 14:47
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        // 1. 点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());

        // 2. order 加入一份牛奶
        order = new Milk(order);

        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());
    }
}
