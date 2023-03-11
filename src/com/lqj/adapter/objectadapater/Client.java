package com.lqj.adapter.objectadapater;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 22:46
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}