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
        if(head == null || head.next == null) return head;

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        ListNode curr = head;
        int idx = 1;
        while(curr != null){
            if(idx % 2 == 1){
                odd.add(curr.val);
            }else{
                even.add(curr.val);
            }
            idx++;
            // if(curr.next != null){
            //     curr = curr.next;
            // }else{
            //     break;
            // }
            curr = curr.next;
        }
        odd.addAll(even);
        ListNode dummy = new ListNode(odd.get(0));
        ListNode temp = dummy;
        for(int i=1; i<odd.size(); i++){
            temp.next = new ListNode(odd.get(i));
            temp = temp.next;
        }
        return dummy;
    }
}