package com.github.nadal.algo.easy.dp;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2019/1/15
 * Description:
 */
public class TestHouseRobber {
    @Test
    public void testSolution() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {2,7,9,3,1};
        int ret = houseRobber.rob(nums);
        System.out.println("ret->" + ret);
    }
}
