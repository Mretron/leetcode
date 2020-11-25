package com.zzj.solution.easy.lianBiaoZhongDaoShuDiKgeJieDianLcof;

import com.zzj.solution.dataStructure.ArrayUtil;
import com.zzj.solution.util.ListUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/26
 */
public class Main {
    public static void main(String[] args) {
        ListUtil.printList(
                new Solution()
                        .getKthFromEnd(
                                ListUtil.getList(
                                        ArrayUtil.getSimpleArray(5)), 3));
    }
}
