class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      int n = answerKey.length();
      int start = 0, end = 0;
      int t =0, f = 0;
      int ans = 0;
        while(end < n){
          // t += (answerKey.charAt(end) == 'T');
          // f += (answerKey.charAt(end) == 'F');
          if(answerKey.charAt(end) == 'T')
          t++;
          else
          f++;

          while( t>k && f>k){
              if(answerKey.charAt(start) == 'T')
              t--;
              else
              f--;
              start++;
            }
          ans = Math.max(ans, end-start+1);
          end++;
        }
      return ans;
    }
}