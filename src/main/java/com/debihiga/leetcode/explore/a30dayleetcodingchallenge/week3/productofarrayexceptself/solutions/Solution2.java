package com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.solutions;

import com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.Solution;

/*
* Approach 2: O(1) space approach
* Although the above solution is good enough to solve the problem
* since we are not using division anymore,
* there's a follow-up component as well which asks us to solve this using constant space.
* Understandably so, the output array does not count towards the space complexity.
* This approach is essentially an extension of the approach above.
* Basically, we will be using the output array as one of L or R and
* we will be constructing the other one on the fly.
* Let's look at the algorithm based on this idea.
*
* Debi note: in this solution R is calculated on the fly
* in a single integer instead of using an array.
* L is calculated an stored in answer.
* nums is never modified.
* In my Solution (Solution 4) I have tried to keep both arrays
* and to do so, I had to modify nums,
* making it more difficult.
* Things don't have to be symmetrically in code, neither in memory.
* */
public class Solution2 extends Solution {
    public int[] productExceptSelf(int[] nums) {

        // The length of the input array
        int length = nums.length;

        // Final answer array to be returned
        int[] answer = new int[length];

        // answer[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so the answer[0] would be 1
        answer[0] = 1;
        for (int i = 1; i < length; i++) {

            // answer[i - 1] already contains the product of elements to the left of 'i - 1'
            // Simply multiplying it with nums[i - 1] would give the product of all
            // elements to the left of index 'i'
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // R contains the product of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right,
        // so the R would be 1
        int R = 1;
        for (int i = length - 1; i >= 0; i--) {

            // For the index 'i', R would contain the
            // product of all elements to the right. We update R accordingly
            answer[i] = answer[i] * R;
            R *= nums[i];
        }

        return answer;
    }
}
