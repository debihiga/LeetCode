package com.debihiga.leetcode.easy.n0232implementqueueusingstacks;

import java.util.LinkedList;

/**
 * The most intuitive way to implement a Queue is with linked lists.
 * */
public class MyLinkedList implements MyQueue {

    private LinkedList<Integer> queue;

    public MyLinkedList() {
        this.queue = new LinkedList<Integer>();
    }

    public void push(int x) {
        this.queue.add(x);
    }

    public int pop() {
        return this.queue.remove();
    }

    public int peek() {
        return this.queue.peek();
    }

    public boolean empty() {
        return this.queue.isEmpty();
    }
}
