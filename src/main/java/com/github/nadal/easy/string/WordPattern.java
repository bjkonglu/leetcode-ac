package com.github.nadal.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: lukong
 * Date: 2019/1/19
 * Description:
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length)
            return false;
        Map map = new HashMap();
        //注意使用的是Integer，而不是int
        for(Integer i=0; i<pattern.length(); i++) {
            if(map.put(pattern.charAt(i), i) != map.put(words[i], i)){
                return false;
            }
        }
        return true;
    }
}
