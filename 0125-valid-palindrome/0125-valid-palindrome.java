class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                b.append(c);
            }
        }
        
        String alphanumericString = b.toString();
        int left = 0;
        int right = alphanumericString.length() - 1;
        
        while (left < right) {
            if (alphanumericString.charAt(left) != alphanumericString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
