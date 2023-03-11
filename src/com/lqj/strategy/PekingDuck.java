package com.lqj.strategy;

/**
 * @Author luqianjiang
 * @Date 2023/3/11 9:41
 * @Description:
 */
public class PekingDuck extends Duck {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }

    //因为北京鸭不能飞翔，因此需要重写fly
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("北京鸭不能飞翔");
    }

}

