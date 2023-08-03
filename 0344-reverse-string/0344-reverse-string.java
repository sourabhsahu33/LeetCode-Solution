class Solution {
    public void swap(char[] s, int start, int end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
    
    public void rev(char[] s, int i, int n) {
        if (i >= n / 2) {
            return;
        }
        swap(s, i, n - i - 1);
        rev(s, i + 1, n);
    }
    
    public void reverseString(char[] s) {
        int n = s.length;
        rev(s, 0, n);
    }
}
