package com.zzj.solution.easy.mergeTwoSortedLists;

import com.zzj.solution.dataStructure.ListNode;
import com.zzj.solution.util.ListUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/15
 */
public class Main {
    public static void main(String[] args) {
        int[] data1 = {2, 3, 4};
        int[] data2 = {5, 6, 8};

        ListNode l1 = ListUtil.getList(data1);
        ListNode l2 = ListUtil.getList(data2);

        Solution solution = new Solution();
        ListUtil.printList(solution.mergeTwoLists(l1, l2));

    }

}
