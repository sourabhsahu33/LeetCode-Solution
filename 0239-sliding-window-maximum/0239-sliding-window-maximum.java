class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k + 1];
        Deque<Integer> qu = new ArrayDeque<>();
        int l = 0, r = 0;
        while(r < n){
            while(!qu.isEmpty() && nums[qu.peekLast()] < nums[r]){
                qu.pollLast();
            }
            qu.offer(r);
            if(l > qu.peekFirst()){
                qu.pollFirst();
            }
            if(r + 1 >= k){
                ans[l] = nums[qu.peekFirst()];
                l++;
            }
            r++;
        }
        return ans;
    }
}
   