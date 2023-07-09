class Solution {
    public int largestVariance(String s) {
        int cnt1 = 0, cnt2 = 0, maxVariance =0;
        HashSet<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
      for(int i=0; i<2; i++){
          for(char l1 : set){
              for(char l2: set){
                  if(l1 == l2){
                      continue;
                  }
                  cnt1 = cnt2 = 0;
                  for(char letter : s.toCharArray()){
                      if(letter == l1){
                          cnt1++;
                      } else if(letter == l2){
                          cnt2++;
                      }
                      if(cnt1 < cnt2){
                          cnt1 = cnt2 = 0;
                      } else if(cnt1 >0 && cnt2> 0 ){
                          maxVariance = Math.max(maxVariance, cnt1 - cnt2);
                      }
                  }
              }
          }
          s = new StringBuilder(s).reverse().toString();
      }
      return maxVariance;
    }
}