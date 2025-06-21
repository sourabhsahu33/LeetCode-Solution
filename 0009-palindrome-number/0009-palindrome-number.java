class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0) return false;
        if ( x == 0) return true;
        int num = x;
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10; 
        }
        if( x == rev){
            return true;
        }        else
        return false;
    }
}