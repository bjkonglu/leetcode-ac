package com.github.nadal.algo.leetcode.easy.string;

/**
 * Author: lukong
 * Date: 2019/1/24
 * Description:
 */
public class AddStrings {
    /**
     *
     * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

     Note:

     The length of both num1 and num2 is < 5100.
     Both num1 and num2 contains only digits 0-9.
     Both num1 and num2 does not contain any leading zero.
     You must not use any built-in BigInteger library or convert the inputs to integer directly.

     思路：
       从字符串尾部开始遍历字符，将字符与'0'字符相减得到该字符代表的字面量，特点就是同时遍历两个字符串，并当其中一个字符串到边界
       条件时，将其当前字符值设置为0
     * */

    public String addStrings(String num1, String num2) {
        StringBuilder retStr = new StringBuilder();
        int carry = 0;
        for(int i = num1.length()-1, j = num2.length()-1; i>=0 || j>=0 || carry>0; i--, j--) {
            int elem1 = i>=0? num1.charAt(i)-'0': 0;
            int elem2 = j>=0? num2.charAt(j)-'0': 0;
            retStr.append((elem1 + elem2 + carry)%10);
            carry = (elem1 + elem2 + carry)/10;
        }
        return retStr.reverse().toString();
    }
}
