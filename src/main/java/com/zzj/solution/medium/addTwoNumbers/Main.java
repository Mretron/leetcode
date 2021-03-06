package com.zzj.solution.medium.addTwoNumbers;

import com.zzj.solution.dataStructure.ListNode;
import com.zzj.solution.util.ListUtil;


/**
 * @author zengzhongjie
 * @date 2020/11/12
 */
public class Main {
    public static void main(String[] args) {
        int[] data1 = {2, 4, 3};
        int[] data2 = {5, 6, 4};

        ListNode l1 = ListUtil.getList(data1);
        ListNode l2 = ListUtil.getList(data2);

        new Solution().addTwoNumbers(l1, l2);

        ListUtil.printList(l1);

    }


}
