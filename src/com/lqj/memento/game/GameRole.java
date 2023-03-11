package com.lqj.memento.game;


/**
 * @Author luqianjiang
 * @Date 2023/3/9 22:39
 * @Description:
 */
public class GameRole {

    private int vit;
    private int def;

    //显示当前游戏角色的状态
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + " 防御力: " + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }



    //编写一个方法，可以保存一个状态对象 Memento
    //创建Memento ,即根据当前的状态得到Memento
    public MementoRole createMemento() {
        return new MementoRole(vit, def);
    }

    //从备忘录对象，恢复GameRole的状态
    public void recoverGameRoleFromMemento(MementoRole mementoRole) {
        this.vit = mementoRole.getVit();
        this.def = mementoRole.getDef();
    }

}

