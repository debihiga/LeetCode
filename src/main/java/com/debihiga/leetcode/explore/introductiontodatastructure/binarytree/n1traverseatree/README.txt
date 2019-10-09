
How to traverse the tree
========================

There are two general strategies to traverse a tree:

A) Breadth First Search (BFS)
We scan through the tree level by level,
following the order of height, from top to bottom.
The nodes on higher level would be visited before the ones with lower levels.

B) Depth First Search (DFS)
In this strategy, we adopt the depth as the priority,
so that one would start from a root and reach all the way down to certain leaf,
and then back to root to reach another branch.
The DFS strategy can further be distinguished as preorder, inorder, and postorder
depending on the relative order among the root node, left node and right node.

Traverse a Tree - Introduction (DFS) -> Stack
====================================

      F
   /     \
  B       G
 / \       \
A   D       I
   / \     /
  C   E   H

1) Pre-order Traversal
Pre-order traversal is to visit the root first. Then traverse the left subtree. Finally, traverse the right subtree.
F-B-A-D-C-E-G-I-H

2) In-order Traversal
In-order traversal is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree.
Typically, for binary search tree, we can retrieve all the data in sorted order using in-order traversal.
A-B-C-D-E-F-G-H-I

3) Post-order Traversal
Post-order traversal is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root.
It is worth noting that when you delete nodes in a tree, deletion process will be in post-order. That is to say, when you delete a node, you will delete its left child and its right child before you delete the node itself.
Also, post-order is widely use in mathematical expression.
It is easier to write a program to parse a post-order expression.
You can easily figure out the original expression using the inorder traversal. However, it is not easy for a program to handle this expression since you have to check the priorities of operations.
If you handle this tree in postorder, you can easily handle the expression using a stack. Each time when you meet a operator, you can just pop 2 elements from the stack, calculate the result and push the result back into the stack.
A-C-E-D-B-H-I-G-F

Level-order Traversal - Introduction (BFS) -> Queue
==========================================

Level-order traversal is to traverse the tree level by level.
Breadth-First Search is an algorithm to traverse or search in data structures like a tree or a graph.
The algorithm starts with a root node and visit the node itself first.
Then traverse its neighbors, traverse its second level neighbors, traverse its third level neighbors, so on and so forth.
When we do breadth-first search in a tree, the order of the nodes we visited is in level order.
Typically, we use a queue to help us to do BFS.