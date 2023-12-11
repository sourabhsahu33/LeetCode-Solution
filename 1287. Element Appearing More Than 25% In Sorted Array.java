class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int percent = n/4;
        int ans = arr[0];
        int count = 1;
        for(int i=1; i<n; i++){
            if(ans == arr[i]) 
            count++;
            else
            count = 1;

            if(count > percent) return arr[i];
            ans = arr[i];
        }
        return ans;
    }
}
