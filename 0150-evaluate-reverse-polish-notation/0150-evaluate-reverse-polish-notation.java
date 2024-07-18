class Solution {
    private int Operation(int a, int b, String s){
        if(s.equals("+")) return a+b;
        if(s.equals("-")) return a-b;
        if(s.equals("*")) return (int)((long)a*(long)b);
        if(s.equals("/")) return a/b;
        return -1;
    }
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();
       for(String s : tokens){
           if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
               int b = st.pop();
               int a = st.pop();
               int ans = Operation(a, b, s);
               st.push(ans);
           }else{
               st.push(Integer.parseInt(s));
           }
       } 
       return st.pop();
    }
}