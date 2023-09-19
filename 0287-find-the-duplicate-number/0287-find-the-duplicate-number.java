class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=1; j<n; j++){
        //         if(nums[i]!=nums[j])
        //          return nums[j];
        //     }
        // }
        // return 0;
        
        // while(nums[0]!=nums[nums[0]]){
        //     int next = nums[nums[0]];
        //     nums[nums[0]] = nums[0];
        //     nums[0] = next;
        // }
        // return nums[0];



        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int duplicate = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                duplicate += entry.getKey();
            }
        }
        return duplicate;
    }
}