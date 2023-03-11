package com.lqj.decorator;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 15:00
 * @Description:
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) { //组合

        this.obj = obj;
    }

    @Override
    public float cost() {

        // getPrice 自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {

        // obj.getDes() 输出被装饰者的信息
        return super.des + " " + super.getPrice() + " && " + obj.getDes();
    }



}

