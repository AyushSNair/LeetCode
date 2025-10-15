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
        List<Integer> arrList = new ArrayList<>();

        preOrder(root, arrList);
        return arrList;
    }

    public void preOrder(TreeNode node, List<Integer> arrList){

        if(node == null){
            return;
        }

        arrList.add(node.val);
        
        //go to left
        preOrder(node.left, arrList);

        //go to right
        preOrder(node.right, arrList);
    }
}