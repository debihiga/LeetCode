package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n3postorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionIterations implements Solution {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root!=null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                nodes.add(0, node.val);
                if (node.left != null) {
                    stack.add(node.left);
                }
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
        }
        return nodes;
    }
}
