class Solution {
    public boolean isPerfectSquare(int num) {
        long i=0;
     for( i=0; i*i<=num && i*i>=0; i++){
         if(i*i==num){
             return true;
         }
     }
        return false;
    }
}