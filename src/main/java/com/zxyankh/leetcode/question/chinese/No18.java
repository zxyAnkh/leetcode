package com.zxyankh.leetcode.question.chinese;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，
 * 判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * <p>
 * 满足要求的四元组集合为：
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 *
 * @author ankh
 * @since 08.05.2019
 */
public class No18 {

    public static void main(String[] args) {
        No18 no18 = new No18();
        no18.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 1);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> sets = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (i != 0 && nums[i] == nums[j] && nums[i] == nums[i - 1]) {
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r] + nums[j];
                    if (sum == target) {
                        sets.add(Arrays.asList(nums[i], nums[l], nums[r], nums[j]));
                        l++;
                        r--;
                    } else if (sum > target) {
                        r--;
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    } else {
                        l++;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                    }
                }
            }
        }
        return new ArrayList<>(sets);
    }

}
