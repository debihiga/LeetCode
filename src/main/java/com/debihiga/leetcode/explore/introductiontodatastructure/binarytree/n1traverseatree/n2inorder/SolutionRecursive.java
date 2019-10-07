package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n2inorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionRecursive implements Solution {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root!=null) {
            // Left
            getSideNodes(root.left, nodes);
            // Node
            nodes.add(root.val);
            // Right
            getSideNodes(root.right, nodes);
        }
        return nodes;
    }

    private void getSideNodes(TreeNode root, List<Integer> nodes) {
        if (root!=null) {
            List<Integer> sideNodes = inorderTraversal(root);
            nodes.addAll(sideNodes);
        }
    }
}
