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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        ListNode hare = head;
        ListNode tortoise = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
}