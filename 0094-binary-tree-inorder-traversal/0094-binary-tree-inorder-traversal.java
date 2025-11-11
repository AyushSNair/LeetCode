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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = root;
        List<Integer> arrList = new ArrayList<>();
        inTraversal(node, arrList);
        return arrList;
    }

    public void inTraversal(TreeNode node, List<Integer> arrList){

        if(node == null){
            return;
        }

        inTraversal(node.left, arrList);
        arrList.add(node.val);
        inTraversal(node.right, arrList);
    }
}