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
    private int max_sum ;
    public int maxPathSum(TreeNode root) {
        max_sum = Integer.MIN_VALUE;
        find(root);
        return max_sum;
    }
    public int find(TreeNode root ){
        if(root == null) return 0;
        int left = Math.max(find(root.left), 0);
        int right = Math.max(find(root.right), 0);
        max_sum = Math.max(max_sum , root.val + left + right);
        return root.val + Math.max(left, right);
    }
}