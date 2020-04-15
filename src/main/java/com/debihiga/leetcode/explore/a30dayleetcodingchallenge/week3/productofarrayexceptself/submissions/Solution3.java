package com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.submissions;

import com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.Solution;

// O(n)
// Division
public class Solution2 extends Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int nZeroes = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                nZeroes++;
            } else {
                totalProduct *= nums[i];
            }
            if(1<nZeroes) {
                break;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nZeroes==0) {
                nums[i] = totalProduct / nums[i];
            } else if(nZeroes==1 && nums[i]!=0) {
                nums[i] = 0;
            } else if(nZeroes==1 && nums[i]==0) {
                nums[i] = totalProduct;
            } else if(1<nZeroes) {
                nums[i] = 0;
            }
        }
        return nums;
    }
}
