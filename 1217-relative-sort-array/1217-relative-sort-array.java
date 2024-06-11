class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : arr1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int idx = 0;
        for(int num : arr2){
            int count = map.get(num);
            while(count-->0){
                arr1[idx++] = num;
                map.remove(num);
            }
        }
        for(int key: map.keySet()){
           int value = map.get(key);
           while(value-->0)
           arr1[idx++]= key;
        } 
        return arr1;
    }
}