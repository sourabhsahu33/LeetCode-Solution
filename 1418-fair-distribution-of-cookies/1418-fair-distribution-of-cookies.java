class Solution {
    int[] children;
    int ans = Integer.MAX_VALUE;

    private void backTrack(int[] cookies, int i) {
        for (int j = 0; j < children.length; j++) {
            children[j] += cookies[i];

            if (i == cookies.length - 1) {
                int max = 0;
                for (int a : children)
                    max = Math.max(max, a);
                ans = Math.min(ans, max);
            } else {
                backTrack(cookies, i + 1);
            }
            children[j] -= cookies[i];
        }
    }

    public int distributeCookies(int[] cookies, int k) {
        children = new int[k];
        backTrack(cookies, 0);
        return ans;
    }
}
