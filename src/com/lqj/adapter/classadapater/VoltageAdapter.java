package com.lqj.adapter.classadapater;

/**
 * @Author luqianjiang
 * @Date 2023/3/4 22:41
 * @Description:
 */
//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        // TODO Auto-generated method stub
        //获取到220V电压
        int srcV = super.output220V();
        int dstV = srcV / 44 ; //转成 5v
        return dstV;
    }

}