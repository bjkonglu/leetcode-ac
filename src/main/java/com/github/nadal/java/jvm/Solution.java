package com.github.nadal.java.jvm;

/**
 * Author: lukong
 * Date: 2019-03-16
 * Description:
 */
public class Solution {

    // 实例化初始化不一定在类初始化结束后才开始初始化
    static Solution solution = new Solution();
    static int b = 112;
    int a = 110;

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    Solution(){
        System.out.println("3");
        System.out.println("a=" + a + ", b=" + b);
    }

    public static void staticFunc() {
        System.out.println("4");
    }


    public static void main(String[] args) {
        staticFunc();
    }
}
