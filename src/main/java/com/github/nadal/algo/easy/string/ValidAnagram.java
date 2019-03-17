package com.github.nadal.algo.easy.string;

/**
 * Author: lukong
 * Date: 2019/1/18
 * Description:
 */
public class ValidAnagram {
    /**
     *
     * Given two strings s and t , write a function to determine if t is an anagram[颠倒字母顺序构词法] of s.
     * Example 1:
     *
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     *
     * 思路：
     *   将字符串s的字符都映射到数组里，相同的字符进行值加一操作，然后再遍历字符串t中的每个字符
     *   遇到相同的字符则进行减一操作，并判断当前位的值是否小于0，小于0说明字符串t出现了字符串s
     *   没有的字符，即判定为false
     * */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int[] map = new int[26];
        for (char sChar : sChars) {
            map[sChar - 'a'] += 1;
        }
        for (char tChar : tChars) {
            if (--map[tChar - 'a'] < 0) return false;
        }
        return true;
    }
}
