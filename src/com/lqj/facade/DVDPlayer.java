package com.lqj.facade;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 21:58
 * @Description: 播放器
 */
public class DVDPlayer {

    //使用单例模式, 使用饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstanc() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on ");
    }
    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }

    //....
    public void pause() {
        System.out.println(" dvd pause ..");
    }
}
