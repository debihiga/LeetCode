package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n3postorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionRecursive implements Solution {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root!=null) {
            // Left
            getSideNodes(root.left, nodes);
            // Right
            getSideNodes(root.right, nodes);
            // Top
            nodes.add(root.val);
        }
        return nodes;
    }

    private void getSideNodes(TreeNode root, List<Integer> nodes) {
        if (root!=null) {
            List<Integer> sideNodes = postorderTraversal(root);
            nodes.addAll(sideNodes);
        }
    }
}
