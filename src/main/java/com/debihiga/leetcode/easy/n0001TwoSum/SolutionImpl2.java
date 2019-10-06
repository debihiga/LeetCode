package com.debihiga.leetcode.easy.n0001TwoSum;

import java.util.HashMap;
import java.util.Map;

public class SolutionImpl2 implements Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> restIndex = new HashMap();
        for (int i=0; i<nums.length; i++) {
            int value = nums[i];
            if (!restIndex.containsKey(value)) {
                int rest = target - nums[i];
                restIndex.put(rest, i);
            } else {
                return new int[] {restIndex.get(value), i};
            }
        }
        return null;
    }
}
