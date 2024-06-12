class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        int uniq_digit = 9;
        int curr_num = 9;
        int total = 10;
        for(int i=2; i<=n && curr_num > 0; i++){
            uniq_digit *= curr_num;
            total += uniq_digit;
            curr_num--;
        }
        return total;
    }
}