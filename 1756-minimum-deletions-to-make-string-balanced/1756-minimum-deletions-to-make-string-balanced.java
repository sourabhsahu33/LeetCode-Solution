class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int cnt=0;
        int n = s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c == 'a'){
                st.pop();
                cnt++;
            }else if(c == 'b'){
                st.push(c);
            }
        }
        return cnt;
    }
}