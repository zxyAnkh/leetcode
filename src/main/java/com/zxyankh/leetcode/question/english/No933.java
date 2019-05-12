package com.zxyankh.leetcode.question.english;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Write a class RecentCounter to count recent requests.
 * <p>
 * It has only one method: ping(int t), where t represents some time in milliseconds.
 * <p>
 * Return the number of pings that have been made from 3000 milliseconds ago until now.
 * <p>
 * Any ping with time in [t - 3000, t] will count, including the current ping.
 * <p>
 * It is guaranteed that every call to ping uses a strictly larger value of t than before.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
 * Output: [null,1,2,3,3]
 * <p>
 * <p>
 * Note:
 * <p>
 * Each test case will have at most 10000 calls to ping.
 * Each test case will call ping with strictly increasing values of t.
 * Each call to ping will have 1 <= t <= 10^9.
 *
 * @author ankh
 * @since 30.04.2019
 */
public class No933 {

    private Deque<Integer> queue = new ArrayDeque<>();

    public int ping(int t) {
        while (!queue.isEmpty()) {
            Integer tt = queue.removeFirst();
            if (t - 3000 <= tt) {
                queue.addFirst(tt);
                break;
            }
        }
        queue.add(t);
        return queue.size();
    }

}
