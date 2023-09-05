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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
          ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len <k ){
            return head;
        }
        ListNode dummy = null;
        temp = head;
        int count=0;
        while(temp != null && count < k)
        {
            ListNode next  = temp.next;
            temp.next = dummy;
            dummy = temp;
            temp = next;
            count++;
        }
        if(temp != null ) {
         head.next = reverseKGroup(temp, k);
         }
         return dummy;
    }

}