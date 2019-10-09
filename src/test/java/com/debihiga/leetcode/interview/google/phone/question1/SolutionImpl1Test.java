package com.debihiga.leetcode.interview.google.phone.question1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionImpl1Test {

    /**
     * Input: [2,1]
     * Output: false
     * */
    @Test
    public void test1() {
        assertFalse(validMountainArray(new int[] {2, 1}));
    }

    /**
     * Input: [3,5,5]
     * Output: false
     * */
    @Test
    public void test2() {
        assertFalse(validMountainArray(new int[] {3, 5, 5}));
    }

    /**
     * Input: [0,3,2,1]
     * Output: true
     * */
    @Test
    public void test3() {
        assertTrue(validMountainArray(new int[] {0,3,2,1}));
    }

    boolean validMountainArray(int[] A) {
        boolean isValid = false;
        int len = A.length;
        if (len<3) {
            return isValid;
        }
        for (int i=1; i<len-1; i++) {
            isValid = true;
            for (int j=0; j<i; j++) {
                if (!(A[j]<A[j+1])) {
                    isValid = false;
                    break;
                }
            }
            for (int j=len-1; j>i; j--) {
                if (!(A[j-1]>A[j])) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                return isValid;
            }
        }
        return false;
    }
}