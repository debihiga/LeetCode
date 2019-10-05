package com.debihiga.leetcode.easy.n0026removeduplicatesfromsortedarray;

public class RemoveDuplicates1 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[j]!=nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
