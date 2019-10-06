package com.debihiga.leetcode.problems.easy.n0053maximumsubarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubArrayBase {

    Solution solution;

    public void test1() {
        int sum = solution.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        assertEquals(6, sum);
    }

    public void test2() {
        int sum = solution.maxSubArray(new int[] {1});
        assertEquals(1, sum);
    }

    public void test3() {
        int sum = solution.maxSubArray(new int[] {-2, 1});
        assertEquals(1, sum);
    }

    public void test4() {
        int sum = solution.maxSubArray(new int[] {-1});
        assertEquals(-1, sum);
    }

    public void test5() {
        int sum = solution.maxSubArray(new int[] {1, 2});
        assertEquals(3, sum);
    }
}
