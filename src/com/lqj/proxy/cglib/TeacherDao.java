package com.lqj.proxy.cglib;

/**
 * @Author luqianjiang
 * @Date 2023/3/6 22:35
 * @Description:
 */
public class TeacherDao {

    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }
}
