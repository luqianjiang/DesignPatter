package com.lqj.proxy.dynamic;

/**
 * @Author luqianjiang
 * @Date 2023/3/6 21:28
 * @Description:
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

}
