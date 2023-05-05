class Solution {
    private boolean isVowels(char c){
        return c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u';
    }
    public int maxVowels(String s, int k) {
      int count =0, max =0;
        for(int i=0; i<s.length(); i++){
            if(isVowels(s.charAt(i))) count++;
            if(i>=k && isVowels(s.charAt(i-k))) count--;
            max = Math.max(count, max);
        }
        return max;
    }
}