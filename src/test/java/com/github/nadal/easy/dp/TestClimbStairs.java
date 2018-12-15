package com.github.nadal.easy.dp;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2018/12/15
 * Description:
 */
public class TestClimbStairs {
    @Test
    public void testSolution() {
        long startTime = System.currentTimeMillis();
        ClimbStairs climbStairs = new ClimbStairs();
        climbStairs.climbStairs(45);
        long endTime = System.currentTimeMillis();
        System.out.println("cost time: " + (endTime - startTime)/1000 + "s");
    }
}
