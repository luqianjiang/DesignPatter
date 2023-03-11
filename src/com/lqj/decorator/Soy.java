package com.lqj.decorator;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 14:59
 * @Description:
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        // TODO Auto-generated constructor stub
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }

}
