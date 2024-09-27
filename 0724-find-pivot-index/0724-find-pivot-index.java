class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i: nums){
            sum += i;
        }
        int cs = 0;
        for(int i=0; i<n; i++){
            int ls = cs;
            int rs = sum - cs - nums[i];
            if(rs == ls){
                return i;
            }
            cs += nums[i];
        }
        return -1;
    }
}