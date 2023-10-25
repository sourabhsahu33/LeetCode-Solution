class Solution {
    public int minimumSum(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int leftmin[] = new int[n];
        int rightmin[] = new int[n];
        Arrays.fill(leftmin, Integer.MAX_VALUE);
        Arrays.fill(rightmin, Integer.MAX_VALUE);
        for(int i=1; i<n; i++){
            leftmin[i] = Math.min(leftmin[i-1], nums[i-1]);
        }
        for(int i=n-2; i>=0; i--){
            rightmin[i] = Math.min(rightmin[i+1], nums[i+1]);
        }
        for(int i=1; i<n-1; i++){
            if(nums[i] > leftmin[i] && nums[i] > rightmin[i]){
                ans = Math.min(ans, nums[i]+leftmin[i]+rightmin[i]);
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}