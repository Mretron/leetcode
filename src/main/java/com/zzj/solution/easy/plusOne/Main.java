package com.zzj.solution.easy.plusOne;

import com.zzj.solution.dataStructure.ArrayUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/18
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {9, 9, 9};
        ArrayUtil.printArray(new Solution().plusOne(array));

        array = new int[] {9, 9, 9};
        ArrayUtil.printArray(new Solution().plusOne1(array));
    }
}
