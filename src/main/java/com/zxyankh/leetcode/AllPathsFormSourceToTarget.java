package com.zxyankh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a directed, acyclic graph of N nodes.  Find all possible paths from node 0 to node N-1,
 * and return them in any order.
 * <p>
 * The graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1.
 * graph[i] is a list of all nodes j for which the edge (i, j) exists.
 * <p>
 * Example:
 * Input: [[1,2], [3], [3], []]
 * Output: [[0,1,3],[0,2,3]]
 * Explanation: The graph looks like this:
 * 0--->1
 * |    |
 * v    v
 * 2--->3
 * There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
 * Note:
 * <p>
 * The number of nodes in the graph will be in the range [2, 15].
 * You can print different paths in any order, but you should keep the order of nodes inside one path.
 *
 * @author ankh
 * @since 26.04.2019
 */
public class AllPathsFormSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return allPathsSourceTarget(graph, 0);
    }

    /**
     * 实际处理
     *
     * @param graph 图
     * @param n     当前是第几个节点
     * @return 路径
     */
    private List<List<Integer>> allPathsSourceTarget(int[][] graph, int n) {
        List<List<Integer>> lists = new ArrayList<>();
        // 如果当前是最后一个节点，则直接返回一条路径，路径只有当前节点
        if (n == graph.length - 1) {
            List<Integer> path = new ArrayList<>();
            path.add(graph.length - 1);
            lists.add(path);
            return lists;
        }
        // 遍历该节点可以通往其他节点的路，将当前节点添加在路径最前
        for (int i : graph[n]) {
            for (List<Integer> path : allPathsSourceTarget(graph, i)) {
                path.add(0, n);
                lists.add(path);
            }
        }
        return lists;
    }

}
