package com.lqj.bridge;

/**
 * @Author luqianjiang
 * @Date 2023/3/5 12:42
 * @Description:
 */
public class UpRightPhone extends Phone {

    //构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 直立样式手机 ");
    }

    public void close() {
        super.close();
        System.out.println(" 直立样式手机 ");
    }

    public void call() {
        super.call();
        System.out.println(" 直立样式手机 ");
    }
}
