class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = candies[0];
        for(int i=0; i<n; i++){
            if(candies[i]>=max)
                max = candies[i];
        }
        ArrayList<Boolean> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else
                ans.add(false);
        }
        return ans;
    }
}