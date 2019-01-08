package com.github.nadal.easy.list;

/**
 * Author: lukong
 * Date: 2019/1/8
 * Description:
 */
public class LinkedListCycle {

    /**
     *
     * Given a linked list, determine if it has a cycle in it.
     *
     * 解题思路：
     *   使用快慢指针的思路，fast指针每次移动两步，slow指针每次移动一步，在没到达最后节点时，如果fast==slow，
     *   则链表里面有环，否则没有环。
     * */

    public boolean hasCycle(RemoveDuplicates.ListNode head) {
        RemoveDuplicates.ListNode fast = head;
        RemoveDuplicates.ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) return true;
        }
        return false;
    }
}
