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
    int height(TreeNode root){
        if(root== null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int left_h = height(root.left);
        int right_h = height(root.right);

        int l_diameter = diameterOfBinaryTree(root.left);
        int r_diameter = diameterOfBinaryTree(root.right);

        return Math.max(left_h+ right_h, Math.max(l_diameter, r_diameter));
    }
}