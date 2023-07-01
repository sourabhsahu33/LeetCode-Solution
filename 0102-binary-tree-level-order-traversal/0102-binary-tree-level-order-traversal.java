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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
        if(root == null ) return wraplist;
        que.offer(root);
        while(!que.isEmpty()){
            int levelnum = que.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for(int i=0; i<levelnum; i++){
              if(que.peek().left != null)que.add(que.peek().left);
              if(que.peek().right != null)que.add(que.peek().right);
              sublist.add(que.poll().val);
            }
            wraplist.add(sublist);
        }
        return wraplist;
    }
}