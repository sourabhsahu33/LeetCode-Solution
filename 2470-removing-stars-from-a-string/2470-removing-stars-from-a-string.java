class Solution {
    public String removeStars(String s) {
       StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)== '*'){
                str.deleteCharAt(str.length()-1);
            }
            else
                str.append(s.charAt(i));
        }
        return str.toString();
    }
}