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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arrList = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            arrList.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(arrList);

        temp = head;
        int i = 0;
        while(temp != null){
            temp.val = arrList.get(i);
            i++;
            temp = temp.next;
        }


        return head;
    }
}