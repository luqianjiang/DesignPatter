package com.lqj.decorator;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 14:59
 * @Description:
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}

