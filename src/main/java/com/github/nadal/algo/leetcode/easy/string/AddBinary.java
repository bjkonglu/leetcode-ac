package com.github.nadal.algo.leetcode.easy.string;

/**
 * Author: lukong
 * Date: 2018/12/13
 * Description:
 */
public class AddBinary {

    /**
     * Given two binary strings, return their sum (also a binary string).
     * The input strings are both non-empty and contains only characters 1 or 0.
     *
     * Example 1:
     *   Input: a = "11", b = "1"
     *   Output: "100"
     *
     * Main:
     *  从两个字符串的尾部开始，选择后面的字符。然后将选择的字符与'0'字符相减，便会得到该字符代表的数值。
     *  下面便是比较常见的加法进位的逻辑了，不过现在这里是二进制进位，逢二进一，并将余数记录到StringBuilder里，
     *  最后判断是否还有进位值，如果有，则将进位值加入到StringBuilder；如果没有，则不做操作。现在我们得到是一个反的结果，
     *  需要反转一下字符串，便是最终结果。
     * */

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() -1;
        int j = b.length() -1;
        int carry = 0;
        int sum;

        while(i >= 0 || j >= 0) {
            sum = carry;
            if(i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if(j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if(carry != 0) sb.append(carry);

        return sb.reverse().toString();
    }
}
