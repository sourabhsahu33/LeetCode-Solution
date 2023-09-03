class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        
        int freq[] = new int[26];
        int count = 0;
        for(int i=0; i<n; i++){
            int ch = s.charAt(i) - 'a' ;
            freq[ch]++;
            if(freq[ch] == 1){
                count++;
            }
            prefix[i] = count;
        }

        freq = new int[26];
        count = 0;
        for(int i=n-1; i>=0; i--){
            int idx = s.charAt(i)-'a';
            freq[idx]++;
            if(freq[idx] == 1){
                count++;
            }
            suffix[i] = count;
        }
        int split = 0;
        for(int i=0; i<n-1; i++){
            if(prefix[i] == suffix[i+1]){
                split++;
            }
        }
        return split;
    }
}