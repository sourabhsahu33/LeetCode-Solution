class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<int[]> pair = new ArrayList<>();
        for(int i=0; i<n; i++){
            pair.add(new int[]{capital[i], profits[i]});
        }
        pair.sort(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> max_profit = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        while(k-->0){
            while(i < n && pair.get(i)[0] <= w){
                max_profit.add(pair.get(i)[1]);
                i++;
            }
            if(max_profit.isEmpty()){
                break;
            }
            w += max_profit.poll();
        }
        return w;
    }
}

 