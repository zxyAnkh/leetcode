package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if (result[0] != 0 && result[1] != 0) {
                break;
            }
        }
        return result;
    }

}
