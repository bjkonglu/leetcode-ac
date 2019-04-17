package com.github.nadal.algo.leetcode.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: lukong
 * Date: 2019/2/25
 * Description:
 */
public class IntersectionTwoArrays {
    /**
     *
     * Given two arrays, write a function to compute their intersection.

     Example 1:

     Input: nums1 = [1,2,2,1], nums2 = [2,2]
     Output: [2,2]
     Example 2:

     Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     Output: [4,9]
     *
     * */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int elem : nums1) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }
        for (int elem : nums2) {
            if (map.containsKey(elem) && map.get(elem) != 0) {
                list.add(elem);
                map.put(elem, map.get(elem) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for(int k=0; k<list.size(); k++) {
            ret[k] = list.get(k);
        }
        return ret;
    }
}
