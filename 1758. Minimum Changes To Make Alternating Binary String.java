class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ope = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) - '0' == i%2 ){
                ope++;
            }
        }
        return Math.min(ope, n-ope);
    }
}
