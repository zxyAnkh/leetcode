package com.zxyankh.leetcode.competition;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 有 N 个花园，按从 1 到 N 标记。在每个花园中，你打算种下四种花之一。
 * <p>
 * paths[i] = [x, y] 描述了花园 x 到花园 y 的双向路径。
 * <p>
 * 另外，没有花园有 3 条以上的路径可以进入或者离开。
 * <p>
 * 你需要为每个花园选择一种花，使得通过路径相连的任何两个花园中的花的种类互不相同。
 * <p>
 * 以数组形式返回选择的方案作为答案 answer，其中 answer[i] 为在第 (i+1) 个花园中种植的花的种类。花的种类用  1, 2, 3, 4 表示。保证存在答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：N = 3, paths = [[1,2],[2,3],[3,1]]
 * 输出：[1,2,3]
 * 示例 2：
 * <p>
 * 输入：N = 4, paths = [[1,2],[3,4]]
 * 输出：[1,2,1,2]
 * 示例 3：
 * <p>
 * 输入：N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
 * 输出：[1,2,3,4]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= N <= 10000
 * 0 <= paths.size <= 20000
 * 不存在花园有 4 条或者更多路径可以进入或离开。
 * 保证存在答案。
 *
 * @author ankh
 * @since 12.05.2019
 */
public class No5056 {


    public int[] gardenNoAdj(int N, int[][] paths) {
        Map<Integer, Garden> map = new HashMap<>(N);
        for (int[] path : paths) {
            Garden garden = map.get(path[0]);
            if (garden == null) {
                garden = new Garden(path[0]);
                map.put(path[0], garden);
            }
            garden.paths.add(path[1]);

            Garden target = map.get(path[1]);
            if (target == null) {
                target = new Garden(path[1]);
                map.put(path[1], target);
            }
            target.paths.add(path[0]);
        }
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            Garden garden = map.get(i + 1);
            if (garden == null) {
                result[i] = 1;
            } else if (garden.paths.isEmpty()) {
                result[i] = 1;
            } else {
                byte b = 0;
                for (int g : garden.paths) {
                    if (result[g - 1] == 1) {
                        b |= 1;
                    } else if (result[g - 1] == 2) {
                        b |= 2;
                    } else if (result[g - 1] == 3) {
                        b |= 4;
                    } else if (result[g - 1] == 4) {
                        b |= 8;
                    }
                }
                if (b == 0) {
                    result[i] = 1;
                } else if (b == 1) {
                    result[i] = 2;
                } else if (b == 2) {
                    result[i] = 1;
                } else if (b == 3) {
                    result[i] = 3;
                } else if (b == 4) {
                    result[i] = 1;
                } else if (b == 5) {
                    result[i] = 2;
                } else if (b == 6) {
                    result[i] = 1;
                } else if (b == 7) {
                    result[i] = 4;
                } else if (b == 8) {
                    result[i] = 1;
                }
            }
        }
        return result;
    }

    class Garden {
        int number;
        Set<Integer> paths;

        public Garden(int number) {
            this.number = number;
            this.paths = new HashSet<>(3);
        }
    }

}
