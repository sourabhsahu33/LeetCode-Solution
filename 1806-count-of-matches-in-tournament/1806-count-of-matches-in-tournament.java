class Solution {
    public int numberOfMatches(int n) {
       int match = 00;
       while(n > 1){
           int x = n % 2;
           if( ( n-x ) % 2 == 0){
               n /= 2;
               match += n;
           }
           match += x;
       }
       return match;
    }
}

