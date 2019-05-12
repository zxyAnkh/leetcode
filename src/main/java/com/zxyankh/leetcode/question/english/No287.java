package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No287 {

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return nums[i];
            }
        }
        return 0;
    }

}
