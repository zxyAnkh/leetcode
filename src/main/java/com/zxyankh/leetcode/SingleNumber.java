package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int x = 0;
        for (int a : nums) {
            x = x ^ a;
        }
        return x;
    }

}
