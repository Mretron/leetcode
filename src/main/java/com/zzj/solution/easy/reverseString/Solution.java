package com.zzj.solution.easy.reverseString;

/**
 * @author zengzhongjie
 * @date 2020/12/1
 */
class Solution {
    public String reverseString(char[] s) {
        int n = s.length;
        // 一个数跟另一个数异或两次，就是自身
        for (int i = 0; i < n / 2; ++i) {
            int j = n - 1 - i;
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
        return new String(s);
    }
}
