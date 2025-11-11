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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode node = root;
        List<Integer> arrList = new ArrayList<>();
        preTraversal(node, arrList);

        return arrList;
    }

    public void preTraversal(TreeNode node, List<Integer> arrList){
        if(node == null){
            return;
        }

        arrList.add(node.val);
        preTraversal(node.left, arrList);
        preTraversal(node.right, arrList);
    }
}