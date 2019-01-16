package com.github.nadal.easy.string;

/**
 * Author: lukong
 * Date: 2019/1/17
 * Description:
 */
public class IsomorphicStrings {
    /**
     *
     * Given two strings s and t, determine if they are isomorphic.
     * Two strings are isomorphic if the characters in s can be replaced to get t.
     * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
     *
     * Example 1:
     *
     * Input: s = "egg", t = "add"
     * Output: true
     *
     * Example 2:
     *
     * Input: s = "foo", t = "bar"
     * Output: false
     *
     * 思路：
     *   处理同构字符串，主要采用映射的方式处理，将两个字符串中的每个字符都映射到两个长度为256的数组里，
     *   然后对比两字符在数组的值是否相等，不相等说明不同构；相同，则说明同构。
     * */

    public boolean isIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int[] sArray = new int[256];
        int[] tArray = new int[256];
        for(int i=0; i<sChars.length; i++) {
            if(sArray[sChars[i]] != tArray[tChars[i]]) {
                return false;
            } else {
                sArray[sChars[i]] = i+1;
                tArray[tChars[i]] = i+1;
            }
        }
        return true;
    }
}
