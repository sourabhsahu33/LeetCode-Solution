class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0 || s.equals("")) return 0;
        int max_len = 0;
        int start = 0, end = 0;
        HashSet<Character> set = new HashSet<>();
        while(end < n){
            if(set.add(s.charAt(end))){
                end++;
                max_len = Math.max(max_len, set.size());
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max_len;
    }
}