package com.zzj.solution.easy.removeElement;

/**
 * @author zengzhongjie
 * @date 2020/11/16
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int delete_index = nums.length - 1;
        int change_index = nums.length - 1;

        while(delete_index >= 0) {
            if(nums[delete_index] == val) {
                swap(nums, delete_index, change_index);
                delete_index--;
                change_index--;
            } else {
                delete_index--;
            }
        }
        return change_index + 1;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}