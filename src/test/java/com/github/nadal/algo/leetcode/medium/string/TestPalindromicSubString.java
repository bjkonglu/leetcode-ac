package com.github.nadal.algo.leetcode.medium.string;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2019-04-17
 * Description:
 */
public class TestPalindromicSubString {
    @Test
    public void testCountSubStrings() {
        PalindromicSubString palindromicSubString = new PalindromicSubString();
        String s = "aaa";
        System.out.println(palindromicSubString.countSubstrings(s));
    }
}
