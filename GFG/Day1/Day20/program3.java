package GFG.Day20;
/*
Height of Binary Tree
Difficulty: EasyAccuracy: 78.58%Submissions: 345K+Points: 2Average Time: 15m
Given the root of a binary tree, your task is to find the maximum depth of the tree.

Note: The maximum depth or height of the tree is the number of edges in the tree from the root to the deepest node.

Examples:

Input: root = [12, 8, 18, 5, 11]

Output: 2
Explanation: One of the longest path from the root(node 12) goes through node 8 to node 5, which has 2 edges.
Input: root = [1, 2, 3, 4, N, 10, 5, N, N, N, N, 6, 7]

Output: 3
Explanation: The longest path from the root(node 1) to a leaf node 6 with 3 edges.
Constraints:
1 ≤ number of nodes ≤ 3*104
0 ≤ node->data ≤ 105


* */
public class program3 {

class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}


    class Solution {
        public int height(Node root) {
            // code here
            if(root == null) return -1;
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left,right)+1;
        }
    }
}
