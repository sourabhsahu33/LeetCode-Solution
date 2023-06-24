class Solution {
    public boolean isPrefixString(String s, String[] words) {
        // code from here.
        StringBuilder ans = new StringBuilder ("");
        for(String str : words){
            ans.append(str);
            if(s.equals(ans.toString()))
            return true;
            if(s.indexOf(ans.toString()) == -1)
            return false;
        }
        return false;
    }
}
