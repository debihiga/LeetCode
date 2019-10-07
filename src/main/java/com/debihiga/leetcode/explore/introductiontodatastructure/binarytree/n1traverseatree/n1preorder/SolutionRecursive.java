package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n1preorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// Recursively
class SolutionRecursive implements Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root!=null) {
            // Top
            nodes.add(root.val);
            // Left
            getSideNodes(root.left, nodes);
            // Right
            getSideNodes(root.right, nodes);
        }
        return nodes;
    }

    private void getSideNodes(TreeNode root, List<Integer> nodes) {
        if (root!=null) {
            List<Integer> sideNodes = preorderTraversal(root);
            nodes.addAll(sideNodes);
        }
    }
}