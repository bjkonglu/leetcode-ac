package com.github.nadal.easy.array;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2019/2/25
 * Description:
 */
public class TestIntersectionTwoArrays {
    @Test
    public void testSolution() {
        IntersectionTwoArrays intersectionTwoArrays = new IntersectionTwoArrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        intersectionTwoArrays.intersect(nums1, nums2);
    }
}
