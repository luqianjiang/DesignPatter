package com.lqj.builder.improver;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 19:45
 * @Description:
 */
public class HighHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 高楼的透明屋顶 ");
    }

}