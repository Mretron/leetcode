package com.zzj.solution.easy.moveZeroes;

import com.zzj.solution.dataStructure.ArrayUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/27
 */
public class Main {
    public static void main(String[] args) {

        int[] data = {1, 0, 0};
        new Solution().moveZeroes(data);
        ArrayUtil.printArray(data);
    }
}
