class Solution {
    public boolean isVowel(char c){
        return(c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
    public String reverseVowels(String s) {
        int j=0;
        char str[] = s.toCharArray();
        String vowel = "";
        for(int i=0; i<str.length; i++){
            if(isVowel(str[i])){
                j++;
                vowel += str[i];
            }
        }
        for(int i=0; i<str.length; i++){
            if(isVowel(str[i])){
                str[i] = vowel.charAt(--j);
            }
        }
        return String.valueOf(str);
    }
}
