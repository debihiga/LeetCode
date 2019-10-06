package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n1preorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// Iteratively
public class SolutionlIterations implements Solution {

    /*
    * Let's start from the root and then
    * at each iteration pop the current node out of the stack and
    * push its child nodes.
    * In the implemented strategy we push nodes into output list
    * following the order Top->Bottom and Left->Right,
    * that naturally reproduces preorder traversal.
    * */
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return output;
    }
}
