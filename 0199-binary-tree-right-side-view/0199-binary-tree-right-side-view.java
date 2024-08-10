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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size-- > 0){
                TreeNode curr = qu.poll();
                if(size == 0){
                    list.add(curr.val);
                }
                if(curr.left != null) qu.offer(curr.left);
                if(curr.right != null) qu.offer(curr.right);
            }
        }
        return list;
    }
}