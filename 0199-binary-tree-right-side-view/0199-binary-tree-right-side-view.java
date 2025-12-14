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
    public List<Integer> rightSideView(TreeNode root) {
        TreeNode node = root;

        List<Integer> arrList = new ArrayList<>();

        rightFunc(node, arrList);

        return arrList;
    }

    public List<Integer> rightFunc(TreeNode node, List<Integer> arrList){
        if(node == null){
            return arrList;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(node);

        while(queue.size() != 0){
            int levelNum = queue.size();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 0; i < levelNum; i++){
                
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }

                arr.add(queue.poll().val);
            }

            arrList.add(arr.get(arr.size() - 1));
        }
        return arrList;
    }
}