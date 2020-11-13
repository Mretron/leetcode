package com.zzj.solution.easy.twoSum;

/**
 * @author zengzhongjie
 * @date 2020/11/13
 */
public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{2, 7, 11, 15};
        int focus = 9;
        int[] result = new Solution().twoSum(data, focus);
        for(int temp : result) {
            System.out.print(temp + " ");
        }
    }
}
