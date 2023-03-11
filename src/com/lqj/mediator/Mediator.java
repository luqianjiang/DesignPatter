package com.lqj.mediator;

/**
 * @Author luqianjiang
 * @Date 2023/3/9 22:13
 * @Description:
 */
public abstract class Mediator {
    //将中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
