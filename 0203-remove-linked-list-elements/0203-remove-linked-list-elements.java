/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode temp = head.next;
        
        while(head != null && head.val == val){
            head = head.next;
        }

        while(temp != null){
            if(temp.val == val){
                prev.next= temp.next;
                temp = prev.next;
                continue;
            }

            if(temp != null){
                prev = temp;
                temp = temp.next;
            }
            
        }

        return head;

    }
}