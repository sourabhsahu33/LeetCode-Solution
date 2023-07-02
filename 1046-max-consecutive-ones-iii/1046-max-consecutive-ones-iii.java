class Solution {
    public int longestOnes(int[] nums, int k) {
      int n = nums.length;
      // int i=0, j=0, ans =Integer.MIN_VALUE, Zerocnt =0;
      // while(j<n){
      //     if(nums[j]==0) {
      //         Zerocnt++;}
      //   while(Zerocnt>k){
      //       if(nums[i]==0){
      //           Zerocnt--;}
      //       i++;
      //   }
      //     ans = Math.max(ans, j-i+1);
      //     j++;
      // }
      //   return ans;
        
        //################################################//
        int i=0,j=0;
        while(j<n){
            if(nums[j]==0) k--;
            if(k<0 && nums[i++] == 0){
                k++;
            }
            j++;
        }
        return j-i;
    }
}