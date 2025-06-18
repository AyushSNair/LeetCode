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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        Collections.reverse(arr);
        while(temp != null){
            temp.val = arr.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}