package com.zxyankh.leetcode.question.english;

/**
 * @author ankh
 * @since 04.10.2018
 */
public class No384 {

    private int[] nums;

    public No384(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] result = new int[nums.length];
        int[] uses = new int[nums.length];
        int count = 0;
        for (int i = 0; i < uses.length; i++) {
            uses[i] = 0;
        }
        while (count < nums.length) {
            int index = (int) (Math.random() * nums.length);
            if (0 == uses[index]) {
                result[count] = nums[index];
                count++;
                uses[index] = 1;
            }
        }
        return result;
    }

}
