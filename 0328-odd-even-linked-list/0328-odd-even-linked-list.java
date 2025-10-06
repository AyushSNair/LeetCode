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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        ListNode temp = head;
        int count = 1;

        while(temp != null){
            if(count % 2 != 0){
                oddList.add(temp.val);
                temp = temp.next;
                count++;
            }
            else if(count % 2 == 0){
                evenList.add(temp.val);
                temp = temp.next;
                count++;
            }
        }

        temp = head;
        for(int i = 0; i < oddList.size(); i++){
            temp.val = oddList.get(i);
            temp = temp.next;
        }

        for(int i = 0; i < evenList.size(); i++){
            temp.val = evenList.get(i);
            temp = temp.next;
        }

        return head;
    }
}