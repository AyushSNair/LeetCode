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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        if(head.next.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
            if(fast == slow){
                ListNode newNode = head;
                while(newNode != slow){
                newNode = newNode.next;
                slow = slow.next;
                }
                if(newNode == slow){
                    return newNode;
                }

            }

        }
        return null;
    }
}