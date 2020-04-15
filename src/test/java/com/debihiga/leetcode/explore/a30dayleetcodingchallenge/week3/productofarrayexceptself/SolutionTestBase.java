package com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself;

import org.junit.Assert;

public abstract class SolutionTestBase {

    public Solution solution;

    public void test1() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] output = new int[] {24, 12, 8, 6};
        Assert.assertArrayEquals(output, solution.productExceptSelf(input));
    }

    public void test2() {
        int[] input = new int[] {1, 0};
        int[] output = new int[] {0, 1};
        Assert.assertArrayEquals(output, solution.productExceptSelf(input));
    }

    public void test3() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] output = new int[] {120, 60, 40, 30, 24};
        Assert.assertArrayEquals(output, solution.productExceptSelf(input));
    }

}
