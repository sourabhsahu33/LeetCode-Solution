class Solution {
    public int compress(char[] chars) {
       int n = chars.length;
       int i = 0;
       int idx = 0;
       while(i < n){
        char curr_char = chars[i];
        int cnt = 0;
        while(i < n && curr_char == chars[i]){
            cnt++;
            i++;
        }
        chars[idx++] = curr_char;
        if(cnt > 1){
            for(char c : String.valueOf(cnt).toCharArray()){
                chars[idx++] = c;
            }
        }
       }
       return idx;
    }
}