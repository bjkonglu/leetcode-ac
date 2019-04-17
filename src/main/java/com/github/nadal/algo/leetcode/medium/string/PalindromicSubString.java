package com.github.nadal.algo.leetcode.medium.string;

/**
 * Author: lukong
 * Date: 2019-04-17
 * Description:
 */
public class PalindromicSubString {

    /**
     * Input: "aaa"
     * Output: 6
     * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
     *
     * 思路：从字符串中某一位字母开始，尝试去扩展子字符串
     * */
    private int count = 0;

    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            // 扩展子字符串
            //奇数长度
            extendSubString(s, i, i);
            //偶数长度
            extendSubString(s, i, i+1);
        }
        return count;
    }

    private void extendSubString(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            count++;
        }
    }
}
