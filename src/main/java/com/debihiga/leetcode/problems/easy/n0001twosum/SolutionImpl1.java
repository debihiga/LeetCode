package com.debihiga.leetcode.problems.easy.n0001twosum;

public class SolutionImpl1 implements Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
