package com.lqj.builder;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 13:27
 * @Description:
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
