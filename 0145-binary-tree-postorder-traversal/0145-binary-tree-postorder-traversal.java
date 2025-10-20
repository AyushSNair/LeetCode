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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arrList = new ArrayList<>();
        postOrderTree(root, arrList);
        return arrList;
    }

    public void postOrderTree(TreeNode node, List<Integer> arrList){
        if(node == null){
            return;
        }
        postOrderTree(node.left, arrList);
        postOrderTree(node.right, arrList);
        arrList.add(node.val);
    }
}