package com.lqj.strategy.improve;

/**
 * @Author luqianjiang
 * @Date 2023/3/11 10:46
 * @Description:
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println(" 不会飞翔  ");
    }

}