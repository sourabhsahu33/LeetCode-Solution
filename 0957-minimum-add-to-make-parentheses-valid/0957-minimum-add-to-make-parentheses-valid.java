class Solution {
    public int minAddToMakeValid(String s) {
        int open_brace = 0;
        int min_add = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                open_brace++;
            }else{
                if(open_brace > 0){
                    open_brace--;
                }else{
                    min_add++;
                }
            }
        }
        return open_brace + min_add;
    }
}