package com.lqj.facade;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 22:00
 * @Description: 屏幕
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }




    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }


}
