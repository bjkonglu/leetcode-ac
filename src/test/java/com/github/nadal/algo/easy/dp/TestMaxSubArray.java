package com.github.nadal.algo.easy.dp;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2018/12/12
 * Description:
 */
public class TestMaxSubArray {
    @Test
    public void testSolution() {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray.maxSubArray(nums);
    }
}
