package com.zzj.solution.easy.mergeSortedArray;

/**
 * @author zengzhongjie
 * @date 2020/11/19
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int new_length = m-- + n-- - 1;
        while(m >= 0 && n >= 0) {
            nums1[new_length--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while(n >= 0) {
            nums1[new_length--] = nums2[n--];
        }
    }
}
