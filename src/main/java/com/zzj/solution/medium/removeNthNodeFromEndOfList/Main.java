package com.zzj.solution.medium.removeNthNodeFromEndOfList;

import com.zzj.solution.dataStructure.ArrayUtil;
import com.zzj.solution.util.ListUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/22
 */
public class Main {
    public static void main(String[] args) {

        ListUtil.printList(
                new Solution()
                        .removeNthFromEnd(
                                ListUtil.getList(
                                        ArrayUtil.getSimpleArray(5)), 2));
    }
}
