package com.github.nadal.algo.leetcode.easy.list;

import org.junit.Test;

/**
 * Author: lukong
 * Date: 2019/1/9
 * Description:
 */
public class TestIntersectionTwoLinkedLists {
    @Test
    public void testSolution() {
        IntersectionTwoLinkedLists intersectionTwoLinkedLists = new IntersectionTwoLinkedLists();
        int[] a = {2, 6, 4};
        int[] b = {1, 5};
        IntersectionTwoLinkedLists.ListNode headA = intersectionTwoLinkedLists.buildList(a);
        IntersectionTwoLinkedLists.ListNode headB = intersectionTwoLinkedLists.buildList(b);

        intersectionTwoLinkedLists.getIntersectionNode(headA, headB);
    }
}
