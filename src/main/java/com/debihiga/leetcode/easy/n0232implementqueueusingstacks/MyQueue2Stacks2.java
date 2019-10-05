package com.debihiga.leetcode.easy.n0232implementqueueusingstacks;

import java.util.Stack;

public class MyQueue2Stacks2 implements MyQueue {

    private Stack<Integer> stack;
    private Stack<Integer> stackReversed;
    private int front;

    public MyQueue2Stacks2() {
        this.stack = new Stack<Integer>();
        this.stackReversed = new Stack<Integer>();
    }

    public void push(int x) {
        if (stack.empty()) {
            this.front = x;
        }
        this.stack.push(x);
    }

    public int peek() {
        if (!stackReversed.isEmpty()) {
            return stackReversed.peek();
        } else {
            return front;
        }
    }

    public int pop() {
        if (this.stackReversed.empty()) {
            while(!this.stack.empty()) {
                this.stackReversed.push(this.stack.pop());     // n push + n pop = 2n operations
            }
        }
        return this.stackReversed.pop();
    }

    public boolean empty() {
        return this.stack.empty() && this.stackReversed.empty();
    }
}
