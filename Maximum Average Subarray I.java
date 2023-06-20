class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(k>n) return -1;
        int sum[] = new int[n];
        sum[0] = nums[0];
        for(int i=1; i<n; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        int max_sum = sum[k-1];
        int max_end = k-1;
        for(int i=k; i<n; i++){
            int curr_sum = sum[i]-sum[i-k];
            if(curr_sum> max_sum){
                max_sum = curr_sum;
                max_end = i;
            }
        }
        return (double) max_sum/k;
    }
}
  
