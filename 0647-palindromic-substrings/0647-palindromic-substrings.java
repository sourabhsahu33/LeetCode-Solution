class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            count += Palindrom(s, i, i);
            count += Palindrom(s, i, i+1);
        }
        return count;
    }
    private int Palindrom(String s, int left, int right){
        int cnt = 0;
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}