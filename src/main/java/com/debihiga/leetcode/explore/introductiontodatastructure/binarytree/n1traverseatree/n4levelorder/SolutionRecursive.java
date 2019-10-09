package com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.n4levelorder;

import com.debihiga.leetcode.explore.introductiontodatastructure.binarytree.n1traverseatree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolutionRecursive implements Solution {
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
        addLevel(queue, levels);
        return levels;
    }

    private void addLevel(LinkedList<TreeNode> queueIn, List<List<Integer>> levels) {
        if (queueIn.isEmpty()) {
            return;
        }
        List<Integer> nodes = new ArrayList<>();
        LinkedList<TreeNode> queueOut = new LinkedList<>();
        while (!queueIn.isEmpty()) {
            TreeNode node = queueIn.pollLast();
            addNode(node.left, queueOut, nodes);
            addNode(node.right, queueOut, nodes);
        }
        if (!nodes.isEmpty()) {
            levels.add(nodes);
        }
        addLevel(queueOut, levels);
    }

    private void addNode(TreeNode node, LinkedList<TreeNode> queue, List<Integer> nodes) {
        if (node!=null) {
            queue.push(node);
            nodes.add(node.val);
        }
    }
}
