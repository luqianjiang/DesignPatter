package com.lqj.memento.game;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author luqianjiang
 * @Date 2023/3/9 22:43
 * @Description:
 */
//守护者对象, 保存游戏角色的状态
public class Caretaker {

    //如果只保存一次状态
    private MementoRole  mementoRole;

    //对GameRole 保存多次状态
    //private ArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
    //private HashMap<String, ArrayList<Memento>> rolesMementos;

    public MementoRole getMemento() {
        return mementoRole;
    }

    public void setMementoRole(MementoRole mementoRole) {
        this.mementoRole = mementoRole;
    }


}