package com.debihiga.leetcode.easy.n0697degreeofanarray;

import static org.junit.Assert.assertEquals;

public abstract class DegreeOfAnArrayBase {

    Solution solution;

    public void test1() {
        int[] nums = new int[] {1, 2, 2, 3, 1};
        int degree = solution.findShortestSubArray(nums);
        assertEquals(2, degree);
    }

    public void test2() {
        int[] nums = new int[] {1,2,2,3,1,4,2};
        int degree = solution.findShortestSubArray(nums);
        assertEquals(6, degree);
    }

    public void test3() {
        int[] nums = new int[] {2,1};
        int degree = solution.findShortestSubArray(nums);
        assertEquals(1, degree);
    }

}