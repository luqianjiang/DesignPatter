package com.lqj.builder.improver;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 19:43
 * @Description:
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }

}
