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
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null){
            return null;
        }
        ListNode temp = head;
        int count = 1;

        while(temp.next!=null){
            temp = temp.next; 
            count++;
        }

        if(temp.next == null){
            temp.next = head;
        }

        if(k > count){
            k = k % count;
        }
        int cnt =0;
        while(cnt != count - k){
            temp = temp.next;
            cnt++;
        }
        ListNode temp2 = temp.next;
        temp.next = null;
        return temp2; 
    }
}