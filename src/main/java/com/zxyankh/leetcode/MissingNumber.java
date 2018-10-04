package com.zxyankh.leetcode;

import java.util.Arrays;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0)
            return 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (result == nums[i]) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

}
