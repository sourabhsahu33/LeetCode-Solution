class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        // List<List<Integer>> ans = new ArrayList<>();
        // for(int i=1; i<=n; i++){
        //     List<Integer> sublist = new ArrayList<>();
        //     for(int j=0; j<n; j++){
        //         if(groupSizes[j] == i){
        //            if(sublist.size() >= i){
        //                ans.add(sublist);
        //                sublist.clear();
        //            }
        //            sublist.add(j);
        //         }
        //     }
        //     if(sublist.size() > 0)
        //     ans.add(sublist);
        // }
        // return ans;

        HashMap<Integer, List<Integer>> sub = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            int size = groupSizes[i];
            sub.putIfAbsent(size, new ArrayList<>());
            sub.get(size).add(i);

            if(sub.get(size).size() == size){
                ans.add(new ArrayList<>(sub.get(size)));
                sub.get(size).clear();
            } 
        }
        return ans;
    }
}