class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1 = word1.length;
        int n2 = word2.length;
        String str1 = "";
        String str2 = "";
        for(int i=0; i<n1; i++){
            str1 += word1[i];
        }
        for(int i=0; i<n2; i++){
            str2 += word2[i];
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
