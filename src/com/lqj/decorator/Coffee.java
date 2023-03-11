package com.lqj.decorator;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 14:43
 * @Description:
 */
public class Coffee  extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }


}
