package com.zzj.solution.medium.removeNthNodeFromEndOfList;

import com.zzj.solution.dataStructure.ListNode;

/**
 * @author zengzhongjie
 * @date 2020/11/22
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 条件检查
        if(head == null || n <= 0) {
            return null;
        }
        // 定义快，慢两个指针
        ListNode fast = head;
        ListNode slow = head;
        // 让快指针先走n步
        for(int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if(fast == null) {
            // 说明删除的是第一个节点
            return head.next;
        }

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
