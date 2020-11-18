package com.zzj.solution.easy.plusOne;

/**
 * @author zengzhongjie
 * @date 2020/11/18
 */
class Solution {
    public int[] plusOne1(int[] digits) {
        int original_length = digits.length;
        int new_length = original_length + 1;
        int[] new_digits = new int[new_length];

        digits[original_length - 1] += 1;
        // 去判断是否需要进位
        jinwei(digits, new_digits, original_length - 1);

        if(new_digits[0] != 1) {
            return digits;
        } else {
            return new_digits;
        }

    }

    /**
     * 网上更好的解法
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i]=0;
            }
        }

        if(digits[0] != 0) {
            return digits;
        } else {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
    }


    private void jinwei(int[] digits, int[] new_digits, int index) {

        if(digits[index] >= 10) {
            digits[index] -= 10;
            new_digits[index + 1] = digits[index];
            if(index == 0) {
                new_digits[0] = 1;
                return;
            } else {
                digits[index - 1] += 1;
            }
            jinwei(digits, new_digits, index - 1);
        }
    }
}
