package com.zzj.solution.easy.mergeSortedArray;

import com.zzj.solution.dataStructure.ArrayUtil;

/**
 * @author zengzhongjie
 * @date 2020/11/19
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6, 0, 0 ,0};
        int[] nums2 = {1,2,3};
        new Solution().merge(nums1, 3, nums2, 3);
        ArrayUtil.printArray(nums1);
    }
}
