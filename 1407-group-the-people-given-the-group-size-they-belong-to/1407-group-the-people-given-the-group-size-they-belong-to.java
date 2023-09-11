class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            List<Integer> sublist = new ArrayList<>();
            for(int j=0; j<n; j++){
                if(groupSizes[j] == i){
                   if(sublist.size() >= i){
                       ans.add(sublist);
                       sublist.clear();
                   }
                   sublist.add(j);
                }
            }
            if(sublist.size() > 0)
            ans.add(sublist);
        }
        return ans;
    }
}