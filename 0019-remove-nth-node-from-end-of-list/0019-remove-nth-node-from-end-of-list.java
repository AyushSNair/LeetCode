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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        int count = 1;
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        
        count = count - n;

        ListNode temp1 = head;
        if(count == 0){
            return temp1.next;
        }
        else if(count == 1 && n==1){
            temp1.next = null;
            return temp1;
        }
        int m = 1;
        while(m != count){
            temp1 = temp1.next;
            m++;
        }
        temp1.next = temp1.next.next;
        return head;
    }
}