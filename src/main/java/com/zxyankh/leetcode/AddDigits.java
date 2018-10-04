package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class AddDigits {

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return addDigits(sum);
        }
    }

}
