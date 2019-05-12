package com.zxyankh.leetcode.competition;

/**
 * 在无限的平面上，机器人最初位于 (0, 0) 处，面朝北方。机器人可以接受下列三条指令之一：
 * <p>
 * "G"：直走 1 个单位
 * "L"：左转 90 度
 * "R"：右转 90 度
 * 机器人按顺序执行指令 instructions，并一直重复它们。
 * <p>
 * 只有在平面中存在圆使得机器人永远无法离开圆时，返回 true。否则，返回 false。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入："GGLLGG"
 * 输出：true
 * 解释：
 * 机器人从 (0,0) 移动到 (0,2)，转 180 度，然后回到 (0,0)。
 * 重复指令时，机器人将保持在以原点为中心，2 为半径的圆中。
 * 示例 2：
 * <p>
 * 输入："GG"
 * 输出：false
 * 解释：
 * 机器人无限向北移动。
 * 示例 3：
 * <p>
 * 输入："GL"
 * 输出：true
 * 解释：
 * 机器人按 (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ... 进行移动。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= instructions.length <= 100
 * instructions[i] 在 {'G', 'L', 'R'} 中
 *
 * @author ankh
 * @since 12.05.2019
 */
public class No5055 {

    public static void main(String[] args) {
        No5055 no5055 = new No5055();
        no5055.isRobotBounded("GL");
    }

    public boolean isRobotBounded(String instructions) {
        int[] pos = walk(instructions);
        int[] pos2 = walk(instructions + instructions + instructions + instructions + instructions);
        return pos[0] == pos2[0] && pos[1] == pos2[1];
    }

    private int[] walk(String instructions) {
        // 0: -x, 1: x, 2: -y, 3: y
        byte direct = 3;
        int[] pos = new int[2];
        for (char c : instructions.toCharArray()) {
            if (c == 'L') {
                if (direct == 0) {
                    direct = 2;
                } else if (direct == 1) {
                    direct = 3;
                } else if (direct == 2) {
                    direct = 1;
                } else if (direct == 3) {
                    direct = 0;
                }
            } else if (c == 'R') {
                if (direct == 0) {
                    direct = 3;
                } else if (direct == 1) {
                    direct = 2;
                } else if (direct == 2) {
                    direct = 0;
                } else if (direct == 3) {
                    direct = 1;
                }
            } else if (c == 'G') {
                if (direct == 0) {
                    pos[0] -= 1;
                } else if (direct == 1) {
                    pos[0] += 1;
                } else if (direct == 2) {
                    pos[1] -= 1;
                } else if (direct == 3) {
                    pos[1] += 1;
                }
            }
        }
        return pos;
    }

}
