class Solution {
    public int singleNumber(int[] nums) {
        // int n =nums.length;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int x : nums){
        //     map.put(x, map.getOrDefault(x,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet())
        // if(entry.getValue()==1){
        //     return entry.getKey();
        // }
        // return -1;

        int ones = 0, twos = 0;
        for(int x : nums){
            ones ^= ( x & ~ twos);
            twos ^= ( x & ~ ones);
        }
        return ones;
    }
}