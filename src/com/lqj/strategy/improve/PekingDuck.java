package com.lqj.strategy.improve;


/**
 * @Author luqianjiang
 * @Date 2023/3/11 9:41
 * @Description:
 */
public class PekingDuck extends Duck {

    public PekingDuck(){
        flyBehavior=new NoFlyBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }



}

