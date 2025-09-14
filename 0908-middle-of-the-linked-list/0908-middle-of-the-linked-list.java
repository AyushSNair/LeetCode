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
        temp = head;
        if(count % 2 == 1){
            int mid = (count / 2) + 1;
            int m = 1;
            while(m != mid ){
                temp = temp.next;
                m++;
            }
        
            return temp;
        }
        else{
            int mid = (count / 2) + 1;
            int m = 1;
            while(m != mid ){
                temp = temp.next;
                m++;
            }

            return temp;
        }
    }
}