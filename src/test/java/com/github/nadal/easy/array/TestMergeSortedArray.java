package com.github.nadal.easy.array;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2018/12/15
 * Description:
 */
public class TestMergeSortedArray {
    @Test
    public void testSolution() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
    }
}
