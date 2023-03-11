package com.lqj.builder.improver;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 19:44
 * @Description:
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        house.setBaise("地基5米");
        System.out.println(" 普通房子打地基5米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子屋顶 ");
    }

}

