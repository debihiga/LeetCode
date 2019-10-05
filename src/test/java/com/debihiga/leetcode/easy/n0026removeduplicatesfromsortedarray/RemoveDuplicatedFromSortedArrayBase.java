package com.debihiga.leetcode.easy.n0026removeduplicatesfromsortedarray;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatedFromSortedArrayBase {

    protected void test1(RemoveDuplicates f) {
        int[] nums = new int[] {1,1,2};
        int len = f.removeDuplicates(nums);
        assertEquals(2, len);
        assertArrayEquals(new int[] {1,2}, Arrays.copyOf(nums, len));
    }

    protected void test2(RemoveDuplicates f) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int len = f.removeDuplicates(nums);
        assertEquals(5, len);
        assertArrayEquals(new int[] {0,1,2,3,4}, Arrays.copyOf(nums, len));
    }

}
