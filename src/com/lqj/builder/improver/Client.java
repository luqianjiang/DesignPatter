package com.lqj.builder.improver;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 19:50
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //完成盖房子，返回产品(普通房子)
        House house = houseDirector.constructHouse();

        System.out.println(house);

//        System.out.println("--------------------------");
//        //盖高楼
//        HighHouse highHouse = new HighHouse();
//        //重置建造者
//        houseDirector.setHouseBuilder(highHouse);
//        //完成盖房子，返回产品(高楼)
//        houseDirector.constructHouse();



    }
}
