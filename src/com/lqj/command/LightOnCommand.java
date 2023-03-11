package com.lqj.command;

/**
 * @Author luqianjiang
 * @Date 2023/3/7 21:58
 * @Description:
 */
public class LightOnCommand implements Command {

    //聚合LightReceiver

    LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        //调用接收者的方法
        light.on();
    }



    @Override
    public void undo() {
        // TODO Auto-generated method stub
        //调用接收者的方法
        light.off();
    }

}
