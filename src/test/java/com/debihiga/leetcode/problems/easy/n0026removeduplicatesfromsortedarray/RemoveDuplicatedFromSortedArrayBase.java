package com.debihiga.leetcode.problems.easy.n0026removeduplicatesfromsortedarray;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * 26 - Remove Duplicates from Sorted Array
 * ========================================
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/solution/
 *
 * Array in Java is fixed in length.
 * Which means you can't just remove an element from the given index in an array,
 * you will need to shift all the elements, that are after the element that has to be removed,
 * to the left to fill the gap left by the removed element.
 * */
abstract class RemoveDuplicatedFromSortedArrayBase {

    void test1(RemoveDuplicates f) {
        int[] nums = new int[] {1,1,2};
        int len = f.removeDuplicates(nums);
        assertEquals(2, len);
        assertArrayEquals(new int[] {1,2}, Arrays.copyOf(nums, len));
    }

    void test2(RemoveDuplicates f) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int len = f.removeDuplicates(nums);
        assertEquals(5, len);
        assertArrayEquals(new int[] {0,1,2,3,4}, Arrays.copyOf(nums, len));
    }

}
