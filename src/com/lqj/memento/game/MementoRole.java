package com.lqj.memento.game;

/**
 * @Author luqianjiang
 * @Date 2023/3/9 22:59
 * @Description:
 */
public class MementoRole {

    //攻击力
    private int vit;
    //防御力
    private int def;

    public MementoRole(int vit, int def) {
        this.vit = vit;
        this.def = def;
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
}
