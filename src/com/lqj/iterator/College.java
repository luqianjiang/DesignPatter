package com.lqj.iterator;

import java.util.Iterator;

/**
 * @Author luqianjiang
 * @Date 2023/3/8 22:10
 * @Description:
 */
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();
}

