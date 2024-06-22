class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int cnt = 0, oddcount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num : nums){
            if(num % 2 != 0){
                oddcount++;
            }
            
            if(map.containsKey(oddcount - k)){
                cnt += map.get(oddcount - k);
            }

            map.put(oddcount , map.getOrDefault(oddcount, 0) + 1);
        }
        return cnt;
    }
}