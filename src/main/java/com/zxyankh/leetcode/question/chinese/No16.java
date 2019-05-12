package com.zxyankh.leetcode.question.chinese;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 * 使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * <p>
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * @author ankh
 * @since 05.05.2019
 */
public class No16 {

    /**
     * 这题采用了最暴力的方法，其实可以先排序，然后从两边开始移动指针
     */
    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int tmp = target - sum;
                    if (Math.abs(tmp) < Math.abs(diff)) {
                        diff = tmp;
                    }
                }
            }
        }
        return target - diff;
    }

}
