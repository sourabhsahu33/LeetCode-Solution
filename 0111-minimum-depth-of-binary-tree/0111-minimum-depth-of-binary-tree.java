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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left_subtree = minDepth(root.left);
        int right_subtree = minDepth(root.right);
        if(left_subtree ==0 || right_subtree == 0)
        return left_subtree+right_subtree +1;
        return 1+ Math.min(left_subtree , right_subtree);
    }
}