package com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.solutions;

import com.debihiga.leetcode.explore.a30dayleetcodingchallenge.week3.productofarrayexceptself.Solution;

/*
* Approach 1: Left and Right product lists
* It's much easier to build an intuition for solving this problem without division
* once you visualize how the different products except self look like for each of the elements.
* So, let's take a look at an example array and the different products.
*
* Instead of dividing the product of all the numbers in the array by the number at a given index
* to get the corresponding product,
* we can make use of the product of
* all the numbers to the left and
* all the numbers to the right of the index.
* Multiplying these two individual products would give us the desired result as well.
*
* Time complexity : O(N) where N represents the number of elements in the input array.
* We use one iteration to construct the array L,
* one to construct the array R and
* one last to construct the answer array using L and R.
* Space complexity : O(N) used up by the two intermediate arrays that we constructed
* to keep track of product of elements to the left and right.
* */
public class Solution1 extends Solution {
    public int[] productExceptSelf(int[] nums) {

        // The length of the input array
        int length = nums.length;

        // The left and right arrays as described in the algorithm
        int[] L = new int[length];
        int[] R = new int[length];

        // Final answer array to be returned
        int[] answer = new int[length];

        // L[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so L[0] would be 1
        L[0] = 1;
        for (int i = 1; i < length; i++) {

            // L[i - 1] already contains the product of elements to the left of 'i - 1'
            // Simply multiplying it with nums[i - 1] would give the product of all
            // elements to the left of index 'i'
            L[i] = nums[i - 1] * L[i - 1];
        }

        // R[i] contains the product of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right,
        // so the R[length - 1] would be 1
        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {

            // R[i + 1] already contains the product of elements to the right of 'i + 1'
            // Simply multiplying it with nums[i + 1] would give the product of all
            // elements to the right of index 'i'
            R[i] = nums[i + 1] * R[i + 1];
        }

        // Constructing the answer array
        for (int i = 0; i < length; i++) {
            // For the first element, R[i] would be product except self
            // For the last element of the array, product except self would be L[i]
            // Else, multiple product of all elements to the left and to the right
            answer[i] = L[i] * R[i];
        }

        return answer;
    }
}
