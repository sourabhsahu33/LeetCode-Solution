class Solution {
    public int[] sortedSquares(int[] nums) {
     int n = nums.length;
        int temp[] = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = nums[i]*nums[i];
        }
        Arrays.sort(temp);
        return temp;   
    }
}