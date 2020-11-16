package com.zzj.solution.easy.removeElement;

import com.zzj.solution.dataStructure.ArrayUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/16
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int result = new Solution().removeElement(nums, 3);
        ArrayUtil.printArrayByLength(nums, result);

    }
}
