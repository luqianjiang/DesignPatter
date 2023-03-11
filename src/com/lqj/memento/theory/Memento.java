package com.lqj.memento.theory;

/**
 * @Author luqianjiang
 * @Date 2023/3/9 22:40
 * @Description:
 */
public class Memento {
    private String state;

    //构造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}