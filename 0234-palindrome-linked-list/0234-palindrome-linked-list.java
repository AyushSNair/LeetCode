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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }

        Collections.reverse(arr);
        int i = 0;
        ListNode temp2 = head;
        while(temp2 != null){
            if(temp2.val != arr.get(i)){
                return false;
            }
            else{
                i++;
                temp2 = temp2.next;
            }
            
        }
        return true;
    
    }
}