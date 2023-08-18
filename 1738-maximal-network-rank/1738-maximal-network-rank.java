class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int rank =0;
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                int count = 0;
                for(int road[] : roads){
                    if(road[0] == i || road[0] == j || road[1] == i || road[1] == j){
                        count++;
                    }
                }
                rank = Math.max(count, rank);
            }
        }
        
        return rank;
    }
}