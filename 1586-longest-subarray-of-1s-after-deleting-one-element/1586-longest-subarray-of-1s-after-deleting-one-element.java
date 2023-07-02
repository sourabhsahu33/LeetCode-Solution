class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int count=0;
        int j=0;
        int subarr_len =0;
        for(int i=0; i<n; i++){
            if(nums[i]==0)
            count++;
            while(count>1){
                if(nums[j]==0)
                count--;
                j++;
            }
            subarr_len = Math.max(subarr_len, i-j);
        }
        return subarr_len;
    }
}