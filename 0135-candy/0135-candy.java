class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int leftToright[] = new int[n];
        int rightToleft[] = new int[n];

        Arrays.fill(leftToright, 1);
        Arrays.fill(rightToleft, 1);
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                leftToright[i] = leftToright[i-1]+1;
            }
        }
        for(int i = n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                rightToleft[i] = rightToleft[i+1]+1;
            }
        }
        int max_candies = 0;
        for(int i=0; i<n; i++){
            max_candies += Math.max(leftToright[i], rightToleft[i]);
        }
        return max_candies;
    }
}