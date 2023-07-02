class Solution {
    public int maximumRequests(int n, int[][] requests) {
        int[] temp = new int[n];
        return helper(0, requests, temp, n, 0);
    }

    public int helper(int start, int[][] requests, int[] temp, int n, int count) {
        if (start == requests.length) {
            for (int i = 0; i < n; i++) {
                if (temp[i] != 0) {
                    return 0;
                }
            }
            return count;
        }

        // Take 
        temp[requests[start][0]]--;
        temp[requests[start][1]]++;
        int take = helper(start + 1, requests, temp, n, count + 1);

        // Not-take
        temp[requests[start][0]]++;
        temp[requests[start][1]]--;
        int notTake = helper(start + 1, requests, temp, n, count);

        return Math.max(take, notTake);
    }
}