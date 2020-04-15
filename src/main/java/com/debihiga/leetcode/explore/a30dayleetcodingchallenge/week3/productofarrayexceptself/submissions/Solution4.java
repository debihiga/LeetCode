package com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.submissions;

import com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.Solution;

// O(n)
// Without division
// Without extra space
public class Solution4 extends Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int j = nums.length - 1 - i;
            int numi = nums[i];
            int numj = result[j];
            if(i<=j) {
                result[i] = numi;
                numj = nums[j];
            }
            // To right
            int lastProductToRight = 0<i? nums[i-1] : 1;
            nums[i] = lastProductToRight * numi;
            // To left
            int lastProductToLeft = j<nums.length-1? result[j+1] : 1;
            result[j] = lastProductToLeft * numj;
        }
        for(int i=0; i<nums.length; i++) {
            int productToRight = 0<i? nums[i-1] : 1;
            int productToLeft = i<nums.length-1? result[i+1] : 1;
            result[i] = productToRight*productToLeft;
        }
        return result;
    }
}
