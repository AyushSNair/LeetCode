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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        
        
        ArrayList<Integer> pList = new ArrayList<>();
        ArrayList<Integer> qList = new ArrayList<>();

    
        preOrderTraverse(p, pList);
        preOrderTraverse(q, qList);

        if (pList.size() != qList.size()) return false;

        for(int i = 0; i < pList.size(); i++){
            if(!Objects.equals(pList.get(i), qList.get(i))){
                return false;
            }
        }
        return true;

    }

    //preOrder traversal
    public void preOrderTraverse(TreeNode node, ArrayList<Integer> pList){
        if(node == null){
            pList.add(null);
            return;
        }

        pList.add(node.val);
        preOrderTraverse(node.left, pList);
        preOrderTraverse(node.right, pList);

    }
}