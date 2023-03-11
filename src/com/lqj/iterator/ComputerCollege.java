package com.lqj.iterator;

import java.util.Iterator;

/**
 * @Author luqianjiang
 * @Date 2023/3/8 22:12
 * @Description:
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0 ;// 保存当前数组的对象个数


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业", " Java专业 ");
        addDepartment("PHP专业", " PHP专业 ");
        addDepartment("大数据专业", " 大数据专业 ");

    }


    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        // TODO Auto-generated method stub
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new ComputerCollegeIterator(departments);
    }

}