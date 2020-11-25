package com.zzj.solution.easy.singleNumber;

/**
 * @author zengzhongjie
 * @date 2020/11/26
 */
class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
