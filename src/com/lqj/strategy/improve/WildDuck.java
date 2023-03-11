package com.lqj.strategy.improve;



/**
 * @Author luqianjiang
 * @Date 2023/3/11 9:40
 * @Description:
 */
public class WildDuck extends Duck {

    public WildDuck(){
        flyBehavior=new GoodFlyBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(" 这是野鸭 ");
    }

}
