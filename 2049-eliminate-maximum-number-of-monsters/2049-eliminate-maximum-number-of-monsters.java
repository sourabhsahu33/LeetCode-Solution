class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double time[] = new double[n];
        for(int i=0; i<n; i++){
            time[i] = (double) dist[i] / (double) speed[i];
        }

        Arrays.sort(time);
        int t = 0; 
        int ans = 0;

        for(double monster : time){
            if( monster <= t){
                break;
            }else{
                ans++;
                t++;
            }
        }
        return ans;
    }
}