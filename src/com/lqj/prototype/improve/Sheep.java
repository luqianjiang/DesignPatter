package com.lqj.prototype.improve;

/**
 * @Author luqianjiang
 * @Date 2023/3/3 19:01
 * @Description:
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古";
    public Sheep friend; //是对象, 克隆是会如何处理

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();// 把当前对象的属性一一进行对应
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return sheep;
    }


}

