package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class SumOfTwoInteger {

    public int getSum(int a, int b) {
        if (a != 0 && b != 0) {
            int sum = a;
            while (b != 0) {
                sum = a ^ b;
                b = (a & b) << 1;
                a = sum;
            }
            return sum;
        } else {
            return a | b;
        }
    }

}
