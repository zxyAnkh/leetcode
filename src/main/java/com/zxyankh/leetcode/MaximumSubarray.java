package com.zxyankh.leetcode;

/**
 * Given an integer array nums,
 * find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * @author ankh
 * @since 13.10.2018
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int sum = nums[0];
        int maxSum = sum;
        for (int i = 0; i < nums.length; i++) {

        }
        return maxSum;
    }

}
