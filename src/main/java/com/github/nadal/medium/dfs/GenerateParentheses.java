package com.github.nadal.medium.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lukong
 * Date: 2019/2/25
 * Description:
 */
public class GenerateParentheses {
    /**
     *
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

     For example, given n = 3, a solution set is:

     [
     "((()))",
     "(()())",
     "(())()",
     "()(())",
     "()()()"
     ]
     * */

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateOneByOne(ret, n, n, "");
        return ret;
    }
    private void generateOneByOne(List<String> list, int left, int right, String origin) {
        // 去除无效组合
        if(left > right) return;
        if(left > 0) {
            generateOneByOne(list, left-1, right, origin + "(");
        }
        if(right > 0) {
            generateOneByOne(list, left, right-1, origin + ")");
        }
        if(left==0 && right ==0) {
            list.add(origin);
        }
    }
}
