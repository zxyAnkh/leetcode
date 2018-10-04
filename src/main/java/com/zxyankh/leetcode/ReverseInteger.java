package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class ReverseInteger {

    public int reverse(int x) {
        if (0 <= x && x < 10)
            return x;
        long result = 0L;
        int flag = x < 0 ? -1 : 1;
        int y = Math.abs(x);
        double i = 0d;
        while (y > 0) {
            i++;
            y /= 10;
        }
        x = Math.abs(x);
        while (i >= 0) {
            result += (x % 10) * Math.pow(10D, i - 1);
            i--;
            x /= 10;
        }
        return result * flag > 2147483647 || result * flag < -2147483648 ? 0 : (int) result * flag;
    }

}
