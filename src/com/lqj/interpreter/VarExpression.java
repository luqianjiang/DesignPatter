package com.lqj.interpreter;

import java.util.HashMap;

/**
 * @Author luqianjiang
 * @Date 2023/3/10 21:40
 * @Description:
 */
public class VarExpression extends Expression {

    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10, b=20}
    // interpreter 根据 变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}

