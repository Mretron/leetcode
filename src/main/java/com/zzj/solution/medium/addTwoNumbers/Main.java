package com.zzj.solution.medium.addTwoNumbers;

/**
 * @author zengzhongjie
 * @date 2020/11/12
 */
public class Main {
    public static void main(String[] args) {
        int[] data1 = {2, 4, 3};
        int[] data2 = {5, 6, 4};

        ListNode l1 = getList(data1);
        ListNode l2 = getList(data2);

        new Solution().addTwoNumbers(l1, l2);

        System.out.println(l1);

    }

    private static ListNode getList(int[] data) {
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
}
