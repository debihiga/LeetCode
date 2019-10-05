package com.debihiga.leetcode.easy.n0026removeduplicatesfromsortedarray;

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
public class Main {

    public static void main(String args[]) {
        Main main = new Main();
        // https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx
        // Using an anonymous class
        main.runAllTests(new RemoveDuplicates() {
            @Override
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
        });
        // Using a lambda expression
        main.runAllTests((nums) -> RemoveDuplicates1.removeDuplicates(nums));   // 1ms
        // Using a method reference
        main.runAllTests(RemoveDuplicates1::removeDuplicates);                  // 1ms
    }

    private void runAllTests(RemoveDuplicates f) {
        runTest1(f);
        runTest2(f);
    }

    private void runTest1(RemoveDuplicates f) {
        int[] nums = new int[] {1,1,2};
        runTest(f, nums);
    }

    private void runTest2(RemoveDuplicates f) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        runTest(f, nums);
    }

    private void runTest(RemoveDuplicates f, int[] nums) {
        int len = f.removeDuplicates(nums);
        System.out.println(len);
        for (int i=0; i<len; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

}
