package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n4levelorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;

public class LevelOrderBase {

    Solution solution;

    /**
     * Input: [3,9,20,null,null,15,7]
     *    3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * Output:
     * [
     *   [3],
     *   [9,20],
     *   [15,7]
     * ]
     * */
    public void test1() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        n3.left = n9;
        n3.right = n20;
        n20.left = n15;
        n20.right = n7;
        List<List<Integer>> result = solution.levelOrder(n3);
        assertThat(result.get(0), CoreMatchers.hasItems(3));
        assertThat(result.get(1), CoreMatchers.hasItems(9, 20));
        assertThat(result.get(2), CoreMatchers.hasItems(15, 7));
    }

    /**
     * [1,2,3,4,null,null,5]
     * [[1],[2,3],[4,5]]
     * */
    public void test2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right = n5;
        List<List<Integer>> result = solution.levelOrder(n1);
        assertThat(result.get(0), CoreMatchers.hasItems(1));
        assertThat(result.get(1), CoreMatchers.hasItems(2,3));
        assertThat(result.get(2), CoreMatchers.hasItems(4,5));
    }
}
