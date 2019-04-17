package com.github.nadal.algo.leetcode.easy.list;

/**
 * Author: lukong
 * Date: 2018/12/15
 * Description:
 */
public class RemoveDuplicates {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode buildList(int[] nodes) {
        ListNode head = new ListNode(nodes[0]);
        ListNode index = head;
        for (int i=1; i<nodes.length; i++) {
            ListNode curNode = new ListNode(nodes[i]);
            index.next = curNode;
            index = index.next;
        }
        return head;
    }

    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     *
     * Example 2:
     *   Input: 1->1->2->3->3
     *   Output: 1->2->3
     *
     * */

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curNode = head;
        while (curNode != null && curNode.next != null) {
            if (curNode.next.val == curNode.val) {
                // 相等的话，用当前节点与后面所有节点比较，直到出现不相同的节点
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return head;
    }
}
