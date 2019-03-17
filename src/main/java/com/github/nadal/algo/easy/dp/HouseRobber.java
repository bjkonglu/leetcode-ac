package com.github.nadal.algo.easy.dp;

import java.util.Arrays;

/**
 * Author: lukong
 * Date: 2019/1/15
 * Description:
 */
public class HouseRobber {
    /**
     * You are a professional robber planning to rob houses along a street.
     * Each house has a certain amount of money stashed,
     * the only constraint stopping you from robbing each of them is
     * that adjacent houses have security system connected
     * and it will automatically contact the police if two adjacent houses were broken into on the same night.
     * Given a list of non-negative integers representing the amount of money of each house,
     * determine the maximum amount of money you can rob tonight without alerting the police.
     *
     * Example 1:
     *  Input: [1,2,3,1]
     *  Output: 4
     * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
     * Total amount you can rob = 1 + 3 = 4.
     *
     * 思路：
     *   利用动态规划的思想，将问题细分，当处理nums[n]时，robber有两个选择：
     *   第一是rob nums[n]，然后跟n-2之前rob的成果累加；第二是not rob nums[n]，直接获取n-1之前的成果。
     *   因此，可以得到公式：F(n) = Max(F(n-2)+nums[n], F(n-1))
     * */

    private int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return robHouse(nums, nums.length -1);
    }
    private int robHouse(int[] nums, int i) {
        if(i < 0) return 0;
        if(memo[i] > 0) return memo[i];
        int ret = Math.max(robHouse(nums, i-2)+nums[i], robHouse(nums, i-1));
        memo[i] = ret;
        return ret;
    }
}
