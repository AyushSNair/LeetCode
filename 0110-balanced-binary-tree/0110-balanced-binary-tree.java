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
    public boolean isBalanced(TreeNode root) {
        if(root  == null){
            return true;
        }
        int left = maxDepth(root.left); //height of left subtree
        int right = maxDepth(root.right); // height of right subtree
        
        if(Math.abs(left - right) > 1){
            return false;
        }

    
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        return 1 + Math.max(left, right);
    }
}