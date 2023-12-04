class Solution {
    public String largestGoodInteger(String num) {
        char maxchar = ' ';
        int n = num.length();
        for(int i=2; i<n;i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)){
                maxchar = (char)Math.max(maxchar, num.charAt(i));
            }
        }
        if(maxchar == ' '){
            return new String("");
        }
       return new String(new char[]{maxchar, maxchar, maxchar});     
    }
}
