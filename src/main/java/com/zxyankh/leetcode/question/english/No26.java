package com.zxyankh.leetcode.question.english;

/**
 * Given a sorted array nums,
 * remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * @author ankh
 * @since 07.10.2018
 */
public class No26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int length = 1;
        int n = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != n) {
                length++;
                n = nums[i];
                nums[length - 1] = n;
            }
        }
        nums[length - 1] = n;
        return length;
    }

}
