package com.github.nadal.algo.leetcode.easy.array;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2018/12/6
 * Description:
 */
public class TestRemoveDuplicates {
    @Test
    public void testSolution() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1,2,2,3,3,4,5,5,5};
        removeDuplicates.solution(nums);
    }
}
