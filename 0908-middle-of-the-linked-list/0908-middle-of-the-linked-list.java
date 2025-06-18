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
        int count = 1;
        int m = 1;
        ListNode temp = head;
        while(temp.next !=null){
            temp = temp.next;
            count++;
        }
        ListNode temp1 = head;
        if(count % 2 == 1){
            while(m != (count+1)/2){
                temp1 = temp1.next;
                m++;
            }
            return temp1;
        }
        if(count % 2 == 0){
            while(m != (count+2)/2){
                temp1 = temp1.next;
                m++;
            }
            return temp1;
        }
        return temp;
    }
}