package com.zzj.solution.easy.reverseInteger;

/**
 * @author zengzhongjie
 * @date 2020/11/13
 */
public class Solution {


    /**
     * 这是使用long的情况下
     * @param x
     * @return
     */
    public int reverse_byLong(int x) {
        // 使用更长的long来存，这样包含int的溢出情况
        long new_num = 0;
        while(x != 0) {
            new_num = new_num * 10 + x%10;
            x/=10;
        }
        return (int)new_num == new_num ? (int)new_num : 0;
    }

    /**
     * 不使用Long或者其他大数据存储类型的情况
     * @param x
     * @return
     */
    public int revers_normal(int x) {
        int new_num = 0;
        while(x != 0) {
            // 保存加一位之前的值
            int temp_num = new_num;
            new_num = new_num * 10 + x%10;
            x/=10;
            // 一旦加一位，就不同，则证明溢出
            if(new_num / 10 != temp_num) {
                return 0;
            }
        }
        return new_num;
    }
}
