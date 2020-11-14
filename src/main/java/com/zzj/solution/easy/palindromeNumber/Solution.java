package com.zzj.solution.easy.palindromeNumber;

/**
 * @author zengzhongjie
 * @date 2020/11/14
 */
class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        // 注意：还可以判断更多容易结束的条件:负数和以0结尾的数都不会是回文数
        if(x <0 || x % 10 == 0) {
            return false;
        }
        int reverse_num = 0;
        int orginal = x;
        while(x != 0) {
            reverse_num = reverse_num * 10 + x%10;
            x/=10;
        }
        if(reverse_num == orginal) {
            return true;
        }
        return false;
    }
}