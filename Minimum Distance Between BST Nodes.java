class Solution {
    int mini= Integer.MAX_VALUE;
    public void find(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        list.add(root.val);
        find(root.left, list);
        for(int i=list.size()-2; i>=0; i--){
            mini = Math.min(mini, Math.abs(root.val-list.get(i)));
        }
        find(root.right, list);
        list.remove(list.size()-1);
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        find(root,list);
        return mini;
    }
}
