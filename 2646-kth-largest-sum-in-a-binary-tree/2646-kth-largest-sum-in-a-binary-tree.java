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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Long> ans = new ArrayList<>();
        
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
            long sum = 0;
            for(int i=0; i<list.size(); i++){
                sum += list.get(i);
            }
            ans.add(sum);
        }
        if(k > ans.size()) return -1;
        Collections.sort(ans);
        return ans.get(ans.size()-k);
    }
}