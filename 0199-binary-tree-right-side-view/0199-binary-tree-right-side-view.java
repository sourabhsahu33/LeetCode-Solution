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
    public void right(TreeNode root, List<Integer> list, int curr){
        if(root == null) return; 
        if(curr == list.size()){
            list.add(root.val);
          }
        right(root.right, list, curr+1);
        right(root.left, list, curr+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        right(root, ans, 0);
        return ans;
    }
}