class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        // int ans = nums[0];
        // int max = ans;
        // int min = ans;
        
        // for(int i=1;i<n; i++){
        //     if(nums[i]<0){
        //         int temp = max;
        //         max = min;
        //         min = temp;
        //     }
        //     max = Math.max(nums[i],max*nums[i]);
        //     min = Math.min(nums[i], min*nums[i]);
        //     ans = Math.max(ans,max);
        // }
        // return ans;

        int product = 1, ans= nums[0];
        for(int i=0; i<n; i++){
            product *= nums[i];
            ans = Math.max(product, ans);
            if(nums[i] == 0){
                product = 1;
            }
        }
        product = 1;
        for(int i=n-1; i>=0; i--){
            product *= nums[i];
            ans = Math.max(product, ans);
            if(nums[i] == 0){
                product = 1;
            }
        }
        return ans;
    }
}