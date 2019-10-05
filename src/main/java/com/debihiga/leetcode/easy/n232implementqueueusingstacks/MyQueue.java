package com.debihiga.leetcode.easy.n232implementqueueusingstacks;

/**
 * Queue
 * https://www.geeksforgeeks.org/queue-interface-java/
 * FIFO
 * Elements are inserted from one side - rear and removed from the other - front.
 * */
public interface MyQueue {
    /**
     * Push element x to the back of queue.
     * */
    void push(int x);
    /**
     * Get the front element.
     * */
    int peek();
    /**
     * Removes the element from in front of queue.
     * */
    int pop();
    /**
     * Return whether the queue is empty.
     * */
    boolean empty();
}
