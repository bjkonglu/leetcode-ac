package com.github.nadal.algo.medium.list;

/**
 * Author: lukong
 * Date: 2019/3/6
 * Description:
 */
public class AddTwoNumbersII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = reverse(l1);
        ListNode rl2 = reverse(l2);
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;

        int carry = 0;

        while(rl1 != null || rl2 != null) {
            int val1 = rl1 == null? 0: rl1.val;
            int val2 = rl2 == null? 0: rl2.val;

            int sum = val1 + val2 + carry;
            carry = sum/10;
            cur.next = new ListNode(sum%10);

            cur = cur.next;
            rl1 = rl1 == null? null:rl1.next;
            rl2 = rl2 == null? null:rl2.next;
        }

        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return reverse(dummyHead.next);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while(cur != null) {
            ListNode tmpNode = cur.next;
            cur.next = prev;

            prev = cur;
            cur = tmpNode;
        }
        return prev;
    }
}
