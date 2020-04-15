package com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.submissions;

import com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.Solution;

// O(n)
// Without division
public class Solution3 extends Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productsToRight = new int[nums.length];
        int[] productsToLeft = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            // To right
            int lastProductToRight = 0<i? productsToRight[i-1] : 1;
            productsToRight[i] = lastProductToRight * nums[i];
            // To left
            int j = nums.length - 1 - i;
            int lastProductToLeft = j<nums.length-1? productsToLeft[j+1] : 1;
            productsToLeft[j] = lastProductToLeft * nums[j];
        }
        for(int i=0; i<nums.length; i++) {
            int productToRight = 0<i? productsToRight[i-1] : 1;
            int productToLeft = i<nums.length-1? productsToLeft[i+1] : 1;
            nums[i] = productToRight*productToLeft;
        }
        return nums;
    }
}
