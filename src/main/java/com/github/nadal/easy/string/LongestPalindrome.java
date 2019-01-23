package com.github.nadal.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: lukong
 * Date: 2019/1/24
 * Description:
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] chrs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int longest = 0;
        for(char chr: chrs) {
            if(map.containsKey(chr)) {
                int value = map.get(chr);
                map.put(chr, value+1);
            } else {
                map.put(chr, 1);
            }
        }
        boolean single = false;
        for(Map.Entry entry: map.entrySet()) {
            int value = (Integer)entry.getValue();
            if(value % 2 == 0) longest += value;
            if(value % 2 != 0 && value / 2 != 0) {
                longest += value-1;
                single = true;
            }
            if (value == 1) single = true;
        }

        if (single) longest += 1;
        return longest;
    }
}
