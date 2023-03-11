package com.lqj.memento.game;

/**
 * @Author luqianjiang
 * @Date 2023/3/9 23:05
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和boss大战前的状态");
        gameRole.display();

        //把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMementoRole(gameRole.createMemento());

        System.out.println("和boss大战~~~");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();


        System.out.println("大战后，使用备忘录对象恢复到站前");
        MementoRole mementoRole = caretaker.getMemento();
        gameRole.recoverGameRoleFromMemento(mementoRole);
        gameRole.display();
    }
}
