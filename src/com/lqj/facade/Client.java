package com.lqj.facade;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 22:07
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();


        homeTheaterFacade.end();
    }

}
