package com.github.nadal.algo.easy.list;

import java.util.Stack;

/**
 * Author: lukong
 * Date: 2019/1/18
 * Description:
 */
public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    /**
     *
     * Given a singly linked list, determine if it is a palindrome.
     * Example 1:
     *
     * Input: 1->2
     * Output: false
     *
     * Example 2:
     *
     * Input: 1->2->2->2
     * Output: true
     *
     * 思路：
     *   使用快慢指针，当快指针走到链表尾部时，慢指针刚好走到中间的位置。
     *   在这个过程中，将前半部分的节点值入栈；然后使用慢指针开始遍历后半部分节点，
     *   并不断的将栈顶弹出，跟当前的节点值比较，不一样说明不是回文。
     * */
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        while(slow != null) {
            if(stack.pop() != slow.val) return false;
            slow = slow.next;
        }
        return stack.empty();
    }

}
