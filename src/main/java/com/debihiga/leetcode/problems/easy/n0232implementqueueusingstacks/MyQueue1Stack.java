package com.debihiga.leetcode.problems.easy.n0232implementqueueusingstacks;

import java.util.Stack;

public class MyQueue1Stack implements MyQueue {

    private Stack<Integer> stack;

    MyQueue1Stack() {
        this.stack = new Stack<Integer>();
    }

    public void push(int x) {
        this.stack.add(x);
    }

    // Returns and removes bottom of stack.
    public int pop() {
        return this.stack.remove(0);
    }

    // Returns bottom of stack.
    public int peek() {
        return this.stack.firstElement();
    }

    public boolean empty() {
        return this.stack.isEmpty();
    }
}
