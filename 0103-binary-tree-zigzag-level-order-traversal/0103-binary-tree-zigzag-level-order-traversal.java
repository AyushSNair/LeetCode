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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        TreeNode node = root;
        zigzagFunc(wrapList, node);

        return wrapList;
    }

    public List<List<Integer>> zigzagFunc(List<List<Integer>> wrapList, TreeNode node){
        if(node == null){
            return wrapList;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        

        queue.offer(node);
        int j = 1;
        while(queue.size() != 0){
            int levelNum = queue.size();
            ArrayList<Integer> arrList = new ArrayList<>();

            for(int i = 0; i < levelNum; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }

                arrList.add(queue.poll().val);
            }

            if(j % 2 == 0){
                Collections.reverse(arrList);
                wrapList.add(arrList);
            }

            if(j % 2 != 0){
                wrapList.add(arrList);
            }
            j++;
        }
        
        return wrapList;
    }
}