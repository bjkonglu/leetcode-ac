package com.github.nadal.algo.easy.list;

/**
 * Author: lukong
 * Date: 2019/1/9
 * Description:
 */
public class IntersectionTwoLinkedLists {
    /**
     *
     * Write a program to find the node at which the intersection of two singly linked lists begins.
     * For example, the following two linked lists:
     *
     * */

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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }
}
