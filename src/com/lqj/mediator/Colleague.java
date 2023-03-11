package com.lqj.mediator;

/**
 * @Author luqianjiang
 * @Date 2023/3/9 22:08
 * @Description:
 */
//同事抽象类
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
