package com.zzj.solution.easy.lianBiaoZhongDaoShuDiKgeJieDianLcof;

import com.zzj.solution.dataStructure.ListNode;

/**
 * @author zengzhongjie
 * @date 2020/11/26
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null || k <=0) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i < k; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
