package com.zzj.solution.dataStructure;

/**
 * @author zengzhongjie
 * @date 2020/11/16
 */
public class ArrayUtil {

    /**
     * 返回1...n的数组
     * @param range
     * @return
     */
    public static int[] getSimpleArray(int range) {
        int[] data = new int[range];
        for(int i = 0; i < range; i++) {
            data[i] = i + 1;
        }
        return data;
    }

    public static void printArray(int[] nums) {
        printArrayByStartIndex(nums, 0);
    }


    public static void  printArrayByStartIndex(int[] nums, int start_index) {
        for(int i = start_index; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }


    public static void  printArrayByRange(int[] nums, int start_index, int end_index) {
        for(int i = start_index; i <= end_index; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayByLength(int[] nums, int length) {
        for(int i = 0 ; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
