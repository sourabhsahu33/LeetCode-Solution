class Solution {
    public void dfs(int curr, int n, List<Integer> list){
        if(curr > n) return;
        list.add(curr);

       for (int nextDigit = 0; nextDigit <= 9; nextDigit++) {
            int nextNum = curr * 10 + nextDigit;
            
            if (nextNum > n) {
                return;
            }
            
            dfs(nextNum, n, list);  // Recursive call
        }
    }
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
            for(int start = 1; start <= 9; start++){
                dfs(start, n, list);
            }
        return list; 
    }
}