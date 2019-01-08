package com.github.nadal.easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: lukong
 * Date: 2019/1/7
 * Description:
 */
public class SingleNumber {

    /**
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     * Example 1:
     * Input: [2,2,1]
     * Output: 1
     *
     * 解题思路：
     *  1. 利用额外的存储空间，对相同的key进行计数操作，最后寻找计数为1的key
     *  2. 利用XOR(异或操作)，即相同的元素异或操作后为0，0与不同的元素执行异或操作后得到自己本身
     * */

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ret = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int curValue = map.get(num);
                map.put(num, curValue + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) ret = entry.getKey();
        }
        return ret;
    }

    public int singleNumberV2(int[] nums) {
        int ret = 0;
        for(int num: nums) {
            ret ^= num;
        }
        return ret;
    }
}
