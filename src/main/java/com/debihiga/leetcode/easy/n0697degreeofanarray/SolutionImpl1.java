package com.debihiga.leetcode.easy.n0697degreeofanarray;

import java.util.HashMap;

public class SolutionImpl1 implements Solution {

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Element> elements = new HashMap<>();
        int degree = 1;
        for (int i=0; i<nums.length; i++) {
            if (elements.get(nums[i])==null) {
                Element element = new Element();
                element.setFrequency(1);
                element.setI(i);
                elements.put(nums[i], element);
            } else {
                Element element = elements.get(nums[i]);
                int frequency = element.getFrequency()+1;
                element.setFrequency(frequency);
                element.setJ(i);
                elements.put(nums[i], element);
                if (degree<frequency) {
                    degree = frequency;
                }
            }
        }
        if (degree==1) {
            return degree;
        }
        int minLen = nums.length;
        for (Element element : elements.values()) {
            if (element.getFrequency()==degree) {
                int len = element.getJ()-element.getI()+1;
                if (len<minLen) {
                    minLen = len;
                }
            }
        }
        return minLen;
    }

    class Element {
        int frequency=0;
        int i=0;
        int j=0;

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }
    }
}
