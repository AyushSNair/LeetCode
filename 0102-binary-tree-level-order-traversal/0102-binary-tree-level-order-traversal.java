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
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode node = root;
        List<List<Integer>> wrapList = new ArrayList<>();

        levelTraverse(node, wrapList);

        return wrapList;
    }

    public List<List<Integer>> levelTraverse(TreeNode node, List<List<Integer>> wrapList){
        if(node == null){
            return wrapList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int levelNum = 0;

        queue.offer(node);


        while(queue.size() != 0){
            levelNum = queue.size();
            ArrayList<Integer> arrList  = new ArrayList<>();
            for(int i = 0; i < levelNum; i++){
                
                
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }

                arrList.add(queue.poll().val);
            }
            wrapList.add(arrList);
        }
        
        return wrapList;
    }
}