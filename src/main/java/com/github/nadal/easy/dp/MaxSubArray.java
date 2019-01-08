package com.github.nadal.easy.dp;

/**
 * Author: lukong
 * Date: 2018/12/12
 * Description:
 */
public class MaxSubArray {


    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     * Example:
     *   Input: [-2,1,-3,4,-1,2,1,-5,4],
     *   Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Solution:
     *   针对这类问题可以考虑动态规划的方式去解决，首先要得到nums[n]的MaxSubArray, 即A[n], 可以将问题分解成求nums[n-1]的MaxSubArray， 即A[n-1],
     *   依次类推，然后可得到公式：A[n] = A[n-1] > 0 ？(nums[n] + A[n-1]) : nums[n]。最后判断一下Math.max(A[n], max), max刚开始可以设定为nums[0]
     *
     *   针对公式详细描述一下：因为需要连续的子数组，所以当A[n-1]>0时，我们就面临两种选择，一种就是不加入当前的数组元素nums[n]， 这样最大连续子数组的值前一步
     *   就已经算完，我们不需要再计算一次；另一种是加入当前的数组元素nums[n]，即nums[n] + A[n-1]。当A[n-1]<0时， 这个时候不加A[n-1]才会得到最大连续数组的值，即nums[n]。
     * */

    int max = 0;
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        max = nums[0];
        dpMaxSubArr(nums, length);
        return max;
    }
    private int dpMaxSubArr(int[] nums, int n) {
        if(n==1) {
            return nums[0];
        }
        int pre = dpMaxSubArr(nums, n-1);
        int cur = pre > 0 ? (nums[n-1] + pre) : nums[n-1];
        max = Math.max(max, cur);
        return cur;
    }
}
