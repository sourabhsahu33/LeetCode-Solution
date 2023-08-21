class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dual = s + s;
        String sub = dual.substring(1, dual.length() - 1);
        return sub.contains(s);
    }
}