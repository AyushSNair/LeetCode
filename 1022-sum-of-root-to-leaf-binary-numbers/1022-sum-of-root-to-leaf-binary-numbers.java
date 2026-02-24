/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current) {
        if (node == null) return 0;

        // Build binary number
        current = (current << 1) | node.val;

        // If leaf node → return the number formed
        if (node.left == null && node.right == null) {
            return current;
        }

        // Otherwise sum from left + right
        return dfs(node.left, current) + dfs(node.right, current);
    }
}