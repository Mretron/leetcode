package com.zzj.solution.easy.moveZeroes;

/**
 * @author zengzhongjie
 * @date 2020/11/27
 */
class Solution {
    public void moveZeroes(int[] nums) {
        // 可以直接依次把非0往前填
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        // 然后直接用0填满剩余的数
        while(j < nums.length) {
            nums[j++] = 0;
        }
    }
}