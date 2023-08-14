class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // return nums[n-k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x: nums){
            pq.offer(x);
        }
        while(pq.size()-k>0){
            pq.poll();
        }
        return pq.poll();
    } 
}