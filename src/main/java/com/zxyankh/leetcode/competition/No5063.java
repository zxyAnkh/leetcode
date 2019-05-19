package com.zxyankh.leetcode.competition;

import java.util.Arrays;

/**
 * 有一堆石头，每块石头的重量都是正整数。
 * <p>
 * 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * <p>
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 *
 * @author ankh
 * @since 19.05.2019
 */
public class No5063 {

    public static void main(String[] args) {
        No5063 no5063 = new No5063();
        System.out.println(no5063.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        System.out.println(no5063.lastStoneWeight(new int[]{2, 7, 4, 1, 8}));
        System.out.println(no5063.lastStoneWeight(new int[]{1, 2, 2}));
        System.out.println(no5063.lastStoneWeight(new int[]{1, 1}));
        System.out.println(no5063.lastStoneWeight(new int[]{9, 3, 2, 10}));
        System.out.println(no5063.lastStoneWeight(new int[]{3, 7, 2}));
        System.out.println(no5063.lastStoneWeight(new int[]{316, 157, 73, 106, 771, 828, 46, 212, 926, 604, 600, 992, 71, 51, 477, 869, 425, 405, 859, 924, 45, 187, 283, 590, 303, 66, 508, 982, 464, 398}));
    }

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        if (stones.length == 2) {
            return Math.abs(stones[1] - stones[0]);
        }
        int j = -1;
        while (j != 1 && j != 0) {
            j = 0;
            Arrays.sort(stones);
            stones[stones.length - 1] -= stones[stones.length - 2];
            stones[stones.length - 2] = 0;
            for (int i : stones) {
                if (i != 0) {
                    j++;
                }
            }
        }
        Arrays.sort(stones);
        return stones[stones.length - 1];
    }

}
