/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashSet<ListNode> hset = new HashSet<ListNode>();

        while(temp != null){
            hset.add(temp);
            temp = temp.next;
            if(hset.contains(temp)){
                return true;
            }
        }
        return false;

        
    }
}