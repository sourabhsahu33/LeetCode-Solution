class Solution {
    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        // int maXor =0;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //        maXor = Math.max(maXor, nums[i]^nums[j]);
        //     }
        // }
        // return maXor;
        
        int maXor = 0, mask =0;
        for(int i=30; i>=0; i--){
            mask |= (1<<i);
                    HashSet<Integer> set = new HashSet<>();
            for(int j=0; j<n; j++){
                set.add(nums[j] & mask);
            }
            int newmaXor = maXor |(1<<i);
            for(int prefix : set){
                if(set.contains(newmaXor^prefix)){
                    maXor = newmaXor;
                    break;
                }
            }
           set.clear();
        }
        return maXor;
    }
}