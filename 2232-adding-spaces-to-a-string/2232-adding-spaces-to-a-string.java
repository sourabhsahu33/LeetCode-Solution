class Solution {
    public String addSpaces(String s, int[] spaces) {
     StringBuilder str = new StringBuilder();
     int space_idx = 0;
     for(int i=0; i<s.length(); i++){
        if(space_idx < spaces.length && i == spaces[space_idx]){
            str.append(" ");
            space_idx++;
        }
        str.append(s.charAt(i));
     }
     return str.toString();
    }
}