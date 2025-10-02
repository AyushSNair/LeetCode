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
    public ListNode partition(ListNode head, int x) {
        ListNode leftHead = new ListNode(0);
        ListNode rightHead = new ListNode(0);

        ListNode temp = head;
        ListNode left = leftHead;
        ListNode right = rightHead;

        while(temp != null){
            if(temp.val < x){
                left.next = temp;
                left = left.next;
            }
            else if(temp.val >= x){
                right.next = temp;
                right = right.next;
            }
            temp = temp.next;
        }

        right.next = null;
        left.next = rightHead.next;

        return leftHead.next;
    }
}