class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int n = nums.length;

    //################Brute force **************

    // int ans[] = new int[n-k+1];
    // for(int i=0; i<=n-k; i++){
    //     int maxof = Integer.MIN_VALUE;
    //     for(int j=i; j<i+k; j++){
    //         maxof = Math.max(maxof, nums[j]);
    //     }
    //     ans[i] = maxof;
    // }
    // return ans;


    //     int[] ans = new int[nums.length - k + 1];
    //     LinkedList<Integer> qu = new LinkedList<Integer>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (!qu.isEmpty() && qu.peek() == i - k) {
    //             qu.removeFirst();
    //         }
    //         while (!qu.isEmpty() && nums[qu.peekLast()] < nums[i]) {
    //             qu.removeLast();
    //         }
    //         qu.add(i);
    //         if (i + 1 >= k) {
    //             ans[i + 1 - k] = nums[qu.peekFirst()];
    //         }
    //     }
    //     return ans;

    int ans[] = new int[n-k+1];
    int idx = 0;
    Deque<Integer> q = new ArrayDeque<>();
    for(int i=0; i<n; i++){
        // remove the number of range k
        if(!q.isEmpty() && q.peek() == i-k){
            q.poll();
        }
        // remove smaller number in k range as they are notuse
        while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
            q.pollLast();
        }
        q.offer(i);
        if( i >= k-1){
            ans[idx++] = nums[q.peek()];
        }
    }
    return ans;
    }
}
