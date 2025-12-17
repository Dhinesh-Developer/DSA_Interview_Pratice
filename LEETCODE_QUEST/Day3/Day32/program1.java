package LEETCODE_QUEST.Day32;
/*
Q3. Longest Univalue Path

Given the root of a binary tree, return the length of the longest path, where each node in the path has the same value. This path may or may not pass through the root.

The length of the path between two nodes is represented by the number of edges between them.

Example 1:


Input: root = [5,4,5,1,1,null,5]
Output: 2
Explanation: The shown image shows that the longest path of the same value (i.e. 5).
* */
public class program1 {
    class Solution {
        int ans = 0;
        public int longestUnivaluePath(TreeNode root) {
            dfs(root);
            return ans;
        }

        private int dfs(TreeNode node) {
            if (node ==null) return 0;
            int left =dfs(node.left);
            int right = dfs(node.right);
            int leftPath =0,rightPath = 0;

            if(node.left != null && node.left.val == node.val) {
                leftPath =left + 1;
            }
            if(node.right != null && node.right.val == node.val) {
                rightPath = right + 1;
            }

            ans = Math.max(ans, leftPath + rightPath);
            return Math.max(leftPath, rightPath);
        }
    }

}
