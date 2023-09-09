/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = -1;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        helperf(root, k);
        return ans;
    }
    public void helperf(TreeNode root, int k){
        if(root == null || count >= k) return;
        helperf(root.left, k);
        count++;
        if(count==k){
           ans = root.val;
           return;
        }
        helperf(root.right, k);
    }
}