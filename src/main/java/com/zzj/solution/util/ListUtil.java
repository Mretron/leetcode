package com.zzj.solution.util;

import com.zzj.solution.dataStructure.ListNode;

/**
 * @author zengzhongjie
 * @date 2020/11/15
 */
public class ListUtil {

    public static ListNode getList(int[] data) {
        ListNode root = null;
        ListNode next = null;
        for(int temp : data) {
            if(root == null) {
                root = new ListNode(temp);
                root.next = null;
                next = root;
            } else {
                if(next.next == null) {
                    next.next = new ListNode(temp);
                    next.next.next = null;
                    next = next.next;
                }
            }
        }
        return root;
    }

    public static void printList(ListNode list) {
        ListNode p = list;
        while(p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
}
