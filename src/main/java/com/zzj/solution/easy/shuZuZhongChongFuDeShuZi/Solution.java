package com.zzj.solution.easy.shuZuZhongChongFuDeShuZi;

/**
 * @author zengzhongjie
 * @date 2020/11/20
 */
class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i) {
                // 一旦合适的位置已有，那么认定成功
                if(nums[nums[i]] == nums[i]) {
                    return nums[i];
                }
                // 如果不相等，放在正确的位置
                swap(nums, nums[i], nums[nums[i]]);
                i--;
            }
        }
        return -1;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
