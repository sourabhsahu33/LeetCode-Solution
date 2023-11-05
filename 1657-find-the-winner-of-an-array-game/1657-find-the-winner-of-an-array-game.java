class Solution {
    public int getWinner(int[] arr, int k) {
     int n = arr.length;

     int winer = arr[0];
     int win_count = 0;

     for(int i=1; i<n; i++){
        if(winer > arr[i]){
            win_count++;
        }else{
            winer = arr[i];
            win_count = 1;
        } 
        if(win_count == k){
            return winer;
        }
     }
       return winer;
    }
}