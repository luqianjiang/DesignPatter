package com.lqj.state;

/**
 * @Author luqianjiang
 * @Date 2023/3/10 22:25
 * @Description:
 */
public abstract class State {


    // 扣除积分 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract  void dispensePrize();

}
