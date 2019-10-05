package com.debihiga.leetcode.easy.n232implementqueueusingstacks;

import java.util.Stack;

public class MyQueue1Stack implements MyQueue {

    private Stack<Integer> stack;

    public MyQueue1Stack() {
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
