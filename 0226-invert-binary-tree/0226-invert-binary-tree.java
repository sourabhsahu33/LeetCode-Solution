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
    public void swapNode(TreeNode curr){
        if(curr == null) return;
        swapNode(curr.left);
        swapNode(curr.right);

        TreeNode temp = null;
        temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        swapNode(root);
        return root;
    }
}