package com.github.nadal.algo.leetcode.easy.array;

/**
 * Author: lukong
 * Date: 2018/12/11
 * Description:
 */
public class CountSay {

    public String countAndSay(int n) {
        String str = "1";
        for(int i=1; i<n; i++) {
            str = countNums(str);
        }
        return str;
    }
    public String countNums(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        char curChar = str.charAt(0);
        for(int i=1; i < str.length(); i++) {
            char tmpChar = str.charAt(i);
            if(tmpChar == curChar) {
                count++;
            } else {
                sb.append(count);
                sb.append(curChar);
                curChar = tmpChar;
                count = 1;
            }

        }
        sb.append(count);
        sb.append(curChar);
        return sb.toString();
    }
}
