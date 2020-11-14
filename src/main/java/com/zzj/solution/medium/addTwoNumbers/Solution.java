package com.zzj.solution.medium.addTwoNumbers;

import com.zzj.solution.dataStructure.ListNode;

/**
 * @author zengzhongjie
 * @date 2020/11/12
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 先做条件判断
        if(l2 == null) {
            return l1;
        }
        if(l1 == null) {
            return l2;
        }

        // 计算一位数和
        l1.val = l1.val + l2.val;
        jingwei(l1);

        l1.next = addTwoNumbers(l1.next, l2.next);
        return l1;

    }

    private void jingwei(ListNode l1) {
        if(l1.val > 9) {
            l1.val = l1.val % 10;
            if(l1.next == null) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val += 1;
                jingwei(l1.next);
            }
        }
    }
}
