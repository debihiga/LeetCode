package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n3postorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;
import org.hamcrest.CoreMatchers;

import java.util.List;

import static org.junit.Assert.assertThat;

public abstract class PostOrderBase {

    Solution solution;

    /**
     * Input: [1,null,2,3]
     *    1
     *     \
     *      2
     *     /
     *    3
     * Output: [3,2,1]
     * */
    public void test1() {
        // Setup
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.right = n2;
        n2.left = n3;
        // Run
        List<Integer> result = solution.postorderTraversal(n1);
        // Test
        assertThat(result, CoreMatchers.hasItems(3,2,1));
    }
}
