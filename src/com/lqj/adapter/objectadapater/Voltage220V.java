package com.lqj.adapter.objectadapater;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 22:39
 * @Description:
 */
//被适配的类
public class Voltage220V {
    //输出220V的电压 不变
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
