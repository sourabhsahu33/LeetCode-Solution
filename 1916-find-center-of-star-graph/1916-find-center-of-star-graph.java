class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int arr[] : edges){
            int u = arr[0];
            int v = arr[1];

            map.put(u, map.getOrDefault(u, 0) + 1);
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> en: map.entrySet()){
            if(en.getValue() == edges.length){
                return en.getKey();
            }
        }
        return -1;
    }
}