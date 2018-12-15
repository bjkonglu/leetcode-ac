package com.github.nadal.easy.dp;

/**
 * Author: lukong
 * Date: 2018/12/15
 * Description:
 */
public class ClimbStairs {

    /**
     *
     * You are climbing a stair case. It takes n steps to reach to the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * Example 1:
     *   Input: 2
     *   Output: 2
     * Explanation: There are two ways to climb to the top.
     *   1. 1 step + 1 step
     *   2. 2 steps
     * */

    public int climbStairsRecursive(int n) {
        // 递归实现时间复杂度O(2^n)
        if(n == 0 || n == 1) return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairs(int n) {
        if(n == 0 || n == 1) return 1;
        if(n == 2) return 2;
        int[] dpArray = new int[n];
        dpArray[0] = 1;
        dpArray[1] = 2;
        for(int i=2; i<n; i++) {
            dpArray[i] = dpArray[i-1] + dpArray[i-2];
        }
        return dpArray[n-1];
    }

}
