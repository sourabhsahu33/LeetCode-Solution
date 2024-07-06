class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        Arrays.sort(nums);
        int i=0, j = n-1;
        while(i < j){
            if(nums[i] + nums[j] == k){
                cnt++;
                i++;
                j--;
            }else if(nums[i] + nums[j] < k){
                i++;
            }else{
                j--;
            }
        }
        return cnt;
    }
}