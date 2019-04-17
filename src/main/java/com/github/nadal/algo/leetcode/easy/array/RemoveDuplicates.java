package com.github.nadal.algo.leetcode.easy.array;

/**
 * Author: lukong
 * Date: 2018/12/6
 * Description:
 */
public class RemoveDuplicates {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * For example:
     * Given nums = [0,0,1,1,1,2,2,3,3,4],
     * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
     * It doesn't matter what values are set beyond the returned length.
     *
     * Main:
     * 设定两个指针，第一指针(j)指向第一个元素，第二指针(i)指向第二个元素；如果nums[i] != nums[j], 即后面的元素
     * 与前面的元素不同，则将nums[i]移动到nums[++j]，即移动到j后面；如果nums[i] == nums[j], 即后面的元素与前面的元素相同时，只将指针i往后
     * 移动，即i++, 依次类推直到i遍历到数组最后元素，返回++j便是不同元素的个数。
     * */

    public int solution(int[] nums) {
        int j = 0;
        for(int i = 1; i< nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
