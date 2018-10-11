package com.zxyankh.leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 *
 * @author ankh
 * @since 11.10.2018
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0] >= target) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] > target ? 0 : 1;
        }
        int last = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (last < target && target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

}
