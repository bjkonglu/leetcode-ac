package com.github.nadal.algo.leetcode.easy.string;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2019/1/19
 * Description:
 */
public class TestWordPattern {
    @Test
    public void testSolution() {
        WordPattern wordPattern = new WordPattern();
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";

        System.out.println(pattern.length() + ", " + str.split(" ").length);

        boolean flag = wordPattern.wordPattern(pattern, str);
        System.out.println(flag);
    }
}
