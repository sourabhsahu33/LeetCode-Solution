class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            int cnt = n;
            int sum = 0;
            while(cnt > 0){
                sum += (cnt % 10) * (cnt % 10);
                cnt /= 10;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }
}