package com.debihiga.leetcode.easy.n232implementqueueusingstacks;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 232 - Implement Queue Using Stacks
 * ==================================
 *
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 *
 * Example
 * =======
 *
 * QueueLinkedList queue = new QueueLinkedList();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // returns 1
 * queue.pop();   // returns 1
 * queue.empty(); // returns false
 *
 * Notes
 * =====
 *
 * + You must use only standard operations of a stack
 * -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * + Depending on your language, stack may not be supported natively.
 * You may simulate a stack by using a list or deque (double-ended queue),
 * as long as you use only standard operations of a stack.
 * + You may assume that all operations are valid
 * (for example, no pop or peek operations will be called on an empty queue).
 * */
public class Main {

    public static void main(String args[]) {
        // Queue with Linked List
        System.out.println("LinkedList example output.");
        runTest(new MyLinkedList());        // 43 ms

        // Queue with Stack
        System.out.println("Stack example output.");
        runTest(new MyStack());             // X
        System.out.println("MyQueue1Stack example output.");
        runTest(new MyQueue1Stack());       // 45 ms
        runTest(new MyQueue2Stacks1());     // 42 ms
        runTest(new MyQueue2Stacks2());     // 43 ms
    }

    private static void runTest(MyQueue queue) {
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());   // returns 1
        System.out.println(queue.pop());    // returns 1
        System.out.println(queue.empty());  // returns false
    }

}
