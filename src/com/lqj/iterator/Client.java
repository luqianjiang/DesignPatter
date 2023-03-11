package com.lqj.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luqianjiang
 * @Date 2023/3/8 22:25
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        //创建学院
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        //collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }

}

