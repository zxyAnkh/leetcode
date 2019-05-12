package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No238 {

    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int count_zero = 0;
        for (int i : nums) {
            if (i != 0)
                sum *= i;
            else
                count_zero++;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && count_zero == 1)
                result[i] = 0;
            else if (nums[i] != 0 && count_zero > 1) {
                result[i] = 0;
            } else if (nums[i] == 0 && count_zero == 1) {
                result[i] = sum;
            } else if (nums[i] == 0 && count_zero > 1) {
                result[i] = 0;
            } else {
                result[i] = sum / nums[i];
            }
        }
        return result;
    }

}
