package com.debihiga.leetcode.problems.easy.n0026removeduplicatesfromsortedarray;

public class RemoveDuplicatesImpl2 implements RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int nUnique = 0;
        int[] numsUnique = new int[nums.length];
        numsUnique[nUnique] = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != numsUnique[nUnique]) {
                numsUnique[++nUnique] = nums[i];
            }
        }
        for (int i=1; i<nums.length; i++) {
            nums[i] = numsUnique[i];
        }
        return nUnique+1;
    }
}
