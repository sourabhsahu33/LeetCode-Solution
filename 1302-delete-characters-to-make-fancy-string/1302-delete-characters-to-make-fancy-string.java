class Solution {
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray();
        int i = 0;

        for(int j=0; j<s.length(); j++){
            if(i >=2 && chars[i-2] == s.charAt(j) && chars[i-1] == s.charAt(j)){
                continue;
            }
            chars[i++] = s.charAt(j);
        }
        return new String(chars, 0, i);
    }
}