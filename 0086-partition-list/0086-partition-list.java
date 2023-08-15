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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < x) {
                l1.add(list.get(i));
            } else {
                l2.add(list.get(i));
            }
        }
        
        l1.addAll(l2);
        
        if (l1.isEmpty()) {
            return null;
        }
        
        ListNode ans = new ListNode(l1.get(0));
        ListNode curr = ans;
        
        for (int i = 1; i < l1.size(); i++) {
            curr.next = new ListNode(l1.get(i));
            curr = curr.next;
        }
        return ans;
    }
}
