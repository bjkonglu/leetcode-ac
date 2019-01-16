package com.github.nadal.easy.list;

/**
 * Author: lukong
 * Date: 2019/1/16
 * Description:
 */
public class RemoveLinkedListElements {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    /**
     * Remove all elements from a linked list of integers that have value val.
     *
     * Example:
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5
     *
     * 思路：
     *  利用一个假头结点的方式，来处理目前删除节点出现在头部的情况，然后在判断当前节点的下一个节点的值为目标值时，进行删除节点操作；
     *  但是此时不进行节点移动操作，防止遗漏节点判定；当前节点的下一个节点的值不为目标值时，将当前节点移动到下一个节点。依次迭代进行
     *  直到当前节点的下一个节点为空，即到了链表的尾部。
     * */

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode curNode = dummyHead;
        while(curNode.next != null) {
            if(curNode.next.val == val) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return dummyHead.next;
    }
}
