class Solution {
    boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int beautifulSubstrings(String s, int k) {
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            int vowel = 0, cons = 0;
            for(int j=i; j<n; j++){
                if(isVowel(s.charAt(j))){
                    vowel++;
                }else{
                    cons++;
                }
                if(vowel == cons && (vowel * cons) % k == 0){
                    ans++;
                }
            }
        }
        return ans;
    }
}
