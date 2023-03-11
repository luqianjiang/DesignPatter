
package com.lqj.interpreter;

import java.util.HashMap;

/**
 * @Author luqianjiang
 * @Date 2023/3/10 21:36
 * @Description:抽象类表达式，通过HashMap 键值对, 可以获取到变量的值
 */



public abstract class Expression {
    // a + b - c
    // 解释公式和数值, key 就是公式(表达式)中的 参数[a,b,c], value就是就是具体值
    // HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}