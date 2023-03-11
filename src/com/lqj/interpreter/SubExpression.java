package com.lqj.interpreter;

import java.util.HashMap;

/**
 * @Author luqianjiang
 * @Date 2023/3/10 21:48
 * @Description:
 */

public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和 right 表达式相减后的结果
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
