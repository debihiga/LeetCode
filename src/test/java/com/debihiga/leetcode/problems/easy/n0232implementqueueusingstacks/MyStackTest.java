package com.debihiga.leetcode.problems.easy.n0232implementqueueusingstacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest extends ImplementQueueUsingStacksBase {

    @Before
    public void setUp() {
        queue = new MyStack();
        super.setUp(queue);
    }
    @Test
    public void testPeek() {
        assertEquals(2, queue.peek());
    }
    @Test
    public void testPop() {
        assertEquals(2, queue.pop());
    }
    @Test
    public void testEmpty() {
        super.testEmpty();
    }
}