package com.github.nadal.algo.leetcode.easy.list;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2018/12/15
 * Description:
 */
public class TestRemoveDuplicates {
    @Test
    public void testSolution() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nodes = {1,1,1};
        RemoveDuplicates.ListNode head = removeDuplicates.buildList(nodes);

        removeDuplicates.deleteDuplicates(head);
    }
}
