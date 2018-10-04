package com.zxyankh.leetcode;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && i != 0) {
                for (int j = i; j > 0 && nums[j - 1] == 0; j--) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

}
