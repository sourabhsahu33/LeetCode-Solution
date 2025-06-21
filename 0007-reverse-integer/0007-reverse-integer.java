class Solution {
    public int reverse(int x) {
      int rev = 0;
      boolean isNeg = x < 0;
      String strx = String.valueOf(Math.abs(x));
      StringBuilder sb = new StringBuilder(strx).reverse();

      try {
            rev = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        
      return isNeg ? - rev : rev;  
    }
}