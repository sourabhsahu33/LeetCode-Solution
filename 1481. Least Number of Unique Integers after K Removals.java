class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(int freq : map.values()){
            list.add(freq);
        }
        Collections.sort(list);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int freq = it.next();
            if( k >= freq  ){
                k -= freq;
                it.remove();
            }
        }
        return list.size();
    }
}
