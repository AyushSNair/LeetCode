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
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        boolean flag = symmetricFunc(root.left, root.right);

        return flag;
    }

    public boolean symmetricFunc(TreeNode nodeLeft, TreeNode nodeRight){
        if(nodeLeft == null && nodeRight == null){
            return true;
        }
        
        if(nodeLeft == null || nodeRight == null){
            return false;
        }

        if(nodeLeft.val != nodeRight.val){
            return false;
        }

        return symmetricFunc(nodeLeft.left, nodeRight.right) && symmetricFunc(nodeLeft.right, nodeRight.left);

        

        
    }
}