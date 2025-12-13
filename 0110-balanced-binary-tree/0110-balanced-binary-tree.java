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
        if(root == null){
            return true;
        }
        int result = 0;
        
        TreeNode node = root;

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        if(left >= right){
            result = left - right;
        }
        else{
            result = right - left;
        }

        if(result > 1){
            return false;
        }

        return isBalanced(node.left) && isBalanced(node.right);
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