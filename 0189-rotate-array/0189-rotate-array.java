class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is greater than the length of the array
        
        // Temporary array to store the last k elements
        int temp[] = new int[k];
        
        // Copy the last k elements to temp
        for(int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        
        // Shift the rest of the array to the right
        for(int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        
        // Copy the k elements from temp to the beginning of the array
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
