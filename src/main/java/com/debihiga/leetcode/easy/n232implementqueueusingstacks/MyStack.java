package com.debihiga.leetcode.easy.n232implementqueueusingstacks;

import java.util.Stack;

/**
 * Stack
 * https://www.geeksforgeeks.org/stack-class-in-java/
 * LIFO
 * Elements are added and removed from the same end, called top
 * */
public class MyStack implements MyQueue {

    Stack<Integer> stack = new Stack<Integer>();

    // Push element on the top of the stack
    public void push(int x) {
        this.stack.push(x);
    }

    // Display element on the top of the stack
    public int peek() {
        return this.stack.peek();
    }

    // Pop element from the top of the stack
    public int pop() {
        return this.stack.pop();
    }

    // Check whether a stack is empty or not
    public boolean empty() {
        return this.stack.empty();
    }
}
