class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double totaltime = 0;
        int currtime =  0;
        for(int i=0; i<n; i++){
            int arrivaltime = customers[i][0];
            int cooktime = customers[i][1];

            if(currtime < arrivaltime){
                currtime = arrivaltime;
            }
            int waittime = (currtime + cooktime) - arrivaltime;
            totaltime += waittime;

            currtime += cooktime;
        }
        return totaltime / n;
    }
}