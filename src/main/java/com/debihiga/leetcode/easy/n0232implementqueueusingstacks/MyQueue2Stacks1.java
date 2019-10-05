package com.debihiga.leetcode.easy.n0232implementqueueusingstacks;

import java.util.Stack;

public class MyQueue2Stacks1 implements MyQueue {

    private Stack<Integer> stack;

    MyQueue2Stacks1() {
        this.stack = new Stack<Integer>();
    }

    public void push(int x) {
        if(this.stack.empty()) {
            this.stack.push(x);
        } else {
            Stack<Integer> aux = new Stack<Integer>();
            while(!this.stack.empty()) {
                aux.push(this.stack.pop());     // n push + n pop = 2n operations
            }
            aux.push(x);                        // 1 push
            while(!aux.empty()) {
                this.stack.push(aux.pop());     // (n+1) push + (n+1) pop = 2(n+1) operations
            }
            // 2n + 1 + 2(n+1) = 4n + 3 -> O(n) [n: original size]
            // N = n+1 (new size)
            // 4(N-1) + 3 = 4N - 1
        }
    }

    public int peek() {
        return this.stack.peek();
    }

    public int pop() {
        return this.stack.pop();
    }

    public boolean empty() {
        return this.stack.empty();
    }
}
