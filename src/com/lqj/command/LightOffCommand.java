package com.lqj.command;

/**
 * @Author luqianjiang
 * @Date 2023/3/7 22:00
 * @Description:
 */
public class LightOffCommand implements Command {

    // 聚合LightReceiver

    LightReceiver light;

    // 构造器
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        light.on();
    }
}
