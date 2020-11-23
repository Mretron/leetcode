package com.zzj.solution.easy.reverseLinkedList;

import com.zzj.solution.dataStructure.ListNode;

/**
 * @author zengzhongjie
 * @date 2020/11/23
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode new_head = head;
        ListNode left = head.next;
        new_head.next = null;

        while(left != null) {
            ListNode temp = left;
            left = left.next;
            temp.next = new_head;
            new_head = temp;
        }
        return new_head;
    }
}
