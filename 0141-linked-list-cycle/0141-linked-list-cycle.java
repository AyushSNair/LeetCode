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
        ListNode tortoise = head;
        ListNode hare = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare == tortoise){
                tortoise = head;
                head = head.next.next;

                while(tortoise != head){
                    tortoise = tortoise.next;
                    head = head.next.next;
                }

                return true;
            }
        }

        return false;
    }
}