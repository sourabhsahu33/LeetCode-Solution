class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int left_right[] = new int[n];
        int right_left[] = new int[n];
        Arrays.fill(left_right, 1);
        Arrays.fill(right_left, 1);

        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                left_right[i] = left_right[i-1] + 1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                right_left[i] = right_left[i+1] + 1;
            }
        }
        int candy = 0;
        for(int i=0; i<n; i++){
            candy += Math.max(left_right[i] , right_left[i]);
        }
        return candy;
    }
}