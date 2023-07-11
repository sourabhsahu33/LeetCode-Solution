/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void markParents(TreeNode root, Map<TreeNode,TreeNode> parent_track, TreeNode target){
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode current = que.poll();
            if(current.left != null){
                parent_track.put(current.left, current);
                que.offer(current.left);
            }
            if(current.right != null){
                parent_track.put(current.right, current);
                que.offer(current.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent_track = new HashMap<>();
        markParents(root, parent_track, root);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(target);
        visited.put(target, true);
        int curr_level = 0;
        while(!que.isEmpty()){
            int size = que.size();
            if(curr_level == k) break;
            curr_level++;
            for(int i=0; i<size; i++){
                TreeNode current = que.poll();
                if(current.left != null && visited.get(current.left) == null){
                    que.offer(current.left);
                    visited.put(current.left ,true);
                }
                if(current.right != null && visited.get(current.right) == null){
                    que.offer(current.right);
                    visited.put(current.right,true);
                }
                if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null){
                    que.offer(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!que.isEmpty()){
            TreeNode current = que.poll();
            ans.add(current.val);
        }
        return ans;
    }
}