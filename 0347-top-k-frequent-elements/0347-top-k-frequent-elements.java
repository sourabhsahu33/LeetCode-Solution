class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> qu = new PriorityQueue<>((a,b) ->(b.getValue() - a.getValue()));
        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            qu.offer(en);
        }
        for(int i=0; i<k; i++){
            ans[i] = qu.poll().getKey();
        }
        return ans;
    }
}