package com.lqj.strategy.improve;

import java.util.Arrays;

/**
 * @Author luqianjiang
 * @Date 2023/3/11 10:52
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        Integer[] data2 = { 19, 11, 12, 18, 14, 13 };
        Arrays.sort(data2, (var1, var2) -> {
            if(var1 > var2) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(Arrays.toString(data2));

        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();//

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        //动态改变某个对象的行为, 北京鸭 不能飞
        pekingDuck.setFlyBehavior(new BadFlyBehavior());
        System.out.println("北京鸭的实际飞翔能力");
        pekingDuck.fly();
    }
}
