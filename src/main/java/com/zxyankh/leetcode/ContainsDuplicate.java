package com.zxyankh.leetcode;

import java.util.Arrays;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class ContainsDuplicate {

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
