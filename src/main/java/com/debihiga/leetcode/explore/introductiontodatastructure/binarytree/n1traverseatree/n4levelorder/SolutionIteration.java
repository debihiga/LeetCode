package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n4levelorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolutionIteration implements Solution {
    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        List<Integer> nodes = new ArrayList<>();
        if (root==null) {
            return levels;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        nodes.add(root.val);
        levels.add(nodes);
        while (!queue.isEmpty()) {
            nodes = new ArrayList<>();
            int nNodes = queue.size();
            for (int i=0; i<nNodes; i++) {
                root = queue.pollLast();
                addNode(root.left, queue, nodes);
                addNode(root.right, queue, nodes);
            }
            if (!nodes.isEmpty()) {
                levels.add(nodes);
            }
        }
        nodes = new ArrayList<>();
        levels.add(nodes);
        return levels;
    }

    private void addNode(TreeNode node, LinkedList<TreeNode> queue, List<Integer> nodes) {
        if (node!=null) {
            queue.push(node);
            nodes.add(node.val);
        }
    }
}
