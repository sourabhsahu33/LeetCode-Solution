class Solution {
    public boolean isFascinating(int n) {
        /// Concatenate the int n convert string
       String ans = Integer.toString(n) + Integer.toString(n*2) + Integer.toString(n*3);
       // create set contains characters
       HashSet<Character> set = new HashSet<>();
       // check if n and the length of the string should not contains the 0 and < 9
       if(ans.contains("0") || ans.length()>9) return false;
       // iterate the loop in string and convert it char & check if set contains the character
       // or not.
       for(int i=0; i<ans.length(); i++){
           char arr = ans.charAt(i);
           if(set.contains(arr))
           return false;
           else 
           set.add(arr);
       }
       return set.size() == 9;
    }
}