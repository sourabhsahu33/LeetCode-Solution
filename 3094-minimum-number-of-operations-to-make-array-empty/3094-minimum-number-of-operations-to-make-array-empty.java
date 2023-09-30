class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ope = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int count : map.values()){
            if(count == 1){
                return -1;
            }
            ope += count/3;
            if(count % 3 != 0){
                ope++;
            }
        }
        return ope;
    }
}