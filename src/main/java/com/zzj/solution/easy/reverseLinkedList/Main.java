package com.zzj.solution.easy.reverseLinkedList;

import com.zzj.solution.dataStructure.ArrayUtil;
import com.zzj.solution.util.ListUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/23
 */
public class Main {
    public static void main(String[] args) {
        ListUtil.printList(
                new Solution()
                        .reverseList(
                                ListUtil
                                        .getList(
                                                ArrayUtil
                                                        .getSimpleArray(5))));
    }
}
