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
        TreeNode node = root;
        List<Integer> arrList = new ArrayList<>();
        postTraversal(node, arrList);

        return arrList;
    }

    public void postTraversal(TreeNode node, List<Integer> arrList){
        if(node == null){
            return;
        }

        postTraversal(node.left, arrList);
        postTraversal(node.right, arrList);
        arrList.add(node.val);
    }
}