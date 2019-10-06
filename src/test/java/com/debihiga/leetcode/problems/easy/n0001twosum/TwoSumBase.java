package com.debihiga.leetcode.problems.easy.n0001twosum;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumBase {

    Solution solution;

    public void test1() {
        int [] result = solution.twoSum(new int[] {2, 7, 11, 15}, 9);
        assertArrayEquals(new int[] {0,1}, result);
    }

    public void test2() {
        int [] result = solution.twoSum(new int[] {0,4,3,0}, 0);
        assertArrayEquals(new int[] {0,3}, result);
    }
}
