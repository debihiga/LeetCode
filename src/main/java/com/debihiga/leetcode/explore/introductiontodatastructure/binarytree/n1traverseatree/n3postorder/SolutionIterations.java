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
            while(!stack.isEmpty() || root != null){
                if(root != null){
                    stack.push(root);
                    nodes.add(0, root.val);
                    root = root.right;
                }else{
                    root = stack.pop();
                    root = root.left;
                }
            }
        }
        return nodes;
    }
}
