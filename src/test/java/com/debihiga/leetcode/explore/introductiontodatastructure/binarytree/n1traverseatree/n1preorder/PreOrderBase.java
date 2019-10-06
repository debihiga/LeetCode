package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n1preorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;
import org.hamcrest.CoreMatchers;

import java.util.List;

import static org.junit.Assert.assertThat;

public class PreOrderBase {

    Solution solution;

    /**
     * Input: [1,null,2,3]
     * 1
     *  \
     *   2
     *  /
     * 3
     * Output: [1,2,3]
     * */
    public void test1() {
        // Setup
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.right = n2;
        n2.left = n3;
        // Run
        List<Integer> result = solution.preorderTraversal(n1);
        // Test
        assertThat(result, CoreMatchers.hasItems(1,2,3));
    }

    /**
     * Input: [3,1,2]
     *   3
     *  / \
     * 1   2
     * Output: [3,1,2]
     * */
    public void test2() {
        // Setup
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n3.left = n1;
        n3.right = n2;
        // Run
        List<Integer> result = solution.preorderTraversal(n3);
        // Test
        assertThat(result, CoreMatchers.hasItems(3,1,2));
    }
}
