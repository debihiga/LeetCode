package com.debihiga.leetcode.problems.easy.n0053maximumsubarray;

import java.util.Arrays;

/**
* Brute force
* [timeouts]
* */
public class SolutionImpl1 implements Solution {

    @Override
    public int maxSubArray(int[] nums) {
        Integer maxSum = null;
        for (int i=0; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                int sum = 0;
                if (i==j) {
                    sum = nums[i];
                } else {
                    sum = getSum(Arrays.copyOfRange(nums, i, j+1));
                }
                if (maxSum==null || maxSum<sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    private int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
