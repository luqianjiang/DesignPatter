package com.lqj.builder;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 13:28
 * @Description:
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子封顶 ");
    }

}
