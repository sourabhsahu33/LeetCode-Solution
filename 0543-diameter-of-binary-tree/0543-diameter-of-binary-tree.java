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
    public int diameterOfBinaryTree(TreeNode root) {
        int die[] = new int[1];
        height(root, die);
        return die[0];
    }
    public int height(TreeNode root, int die[]){
        if(root == null) return 0;
        int lh = height(root.left, die);
        int rh = height(root.right, die);
        die[0] = Math.max(die[0], lh+rh);
        return 1 + Math.max(lh, rh);
    }
}