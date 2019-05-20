/*
 * Project Name: leetcode
 * File Name: No78.java
 * Class Name: No78
 *
 * Copyright 2019 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft
 *
 * http://www.hengtiansoft.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zxyankh.leetcode.question.chinese;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 *
 * @author ankh
 * @since 20.05.2019
 */
public class No78 {

    /**
     * 0-1
     * 1-2
     * 2-4
     * 3-8
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        list.add(Collections.emptyList());
        if (nums.length == 0) {
            return list;
        }
        for (int i : nums) {
            List<List<Integer>> tList = new LinkedList<>();
            for (List<Integer> l : list) {
                List<Integer> tmp = new ArrayList<>(l);
                tmp.add(i);
                tList.add(tmp);
            }
            list.addAll(tList);
        }
        return list;
    }

}
