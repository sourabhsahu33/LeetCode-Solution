class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(int i: nums){
            pq.offer(i);
        }
        while(k-->1){
            pq.poll();
        }
        return pq.peek();
    }
}