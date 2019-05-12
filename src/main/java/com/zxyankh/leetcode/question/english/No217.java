package com.zxyankh.leetcode.question.english;

import java.util.Arrays;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No217 {

    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return false;
        Arrays.sort(nums);
        int j = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (j == nums[i])
                return true;
            j = nums[i];
        }
        return false;
    }

}
