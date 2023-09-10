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
    public int maxLevelSum(TreeNode root) {
      if(root == null) return -1;
      Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
      List<Integer> ans = new ArrayList<>();
      
      while(!q.isEmpty()){
          List<Integer> list = new ArrayList<>();
          int size = q.size();
          for(int i=0; i<size; i++){
              TreeNode node = q.poll();
              list.add(node.val);
              if(node.left != null){
                  q.offer(node.left);
              }
              if(node.right != null){
                  q.offer(node.right);
              }
          }
          int sum = 0;
          for(int i=0; i<list.size(); i++){
              sum += list.get(i);
          }
          ans.add(sum);
      }
      Integer max_value = Collections.max(ans);
      Integer Idx = ans.indexOf(max_value);
      return Idx+1;
    }
}