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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode node = head;
        while(node != null){
            len++;
            node = node.next;
        }
        int partsize = len /k; int extra_node = len % k;
        ListNode ans[] = new ListNode[k];
        node = head;

        for(int i = 0; i<k; i++){
            ans[i] = node;

            int curr_size = partsize + ( extra_node > 0 ? 1: 0);
            extra_node--;

            for(int j = 0; j< curr_size - 1; j++){
                if(node != null)
                node = node.next;
            }
            if(node != null){
                ListNode next = node.next;
                node.next = null;
                node = next;
            }
        }
        return ans;
    }
}