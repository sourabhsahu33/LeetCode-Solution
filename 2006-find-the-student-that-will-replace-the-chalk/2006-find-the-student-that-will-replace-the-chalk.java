class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length; 
        long sum = 0;
        for(int i : chalk){
            sum += i;
        }
        int remain_chalk = (int)(k % sum);
        for(int i=0; i<n; i++){
            if(remain_chalk < chalk[i]){
                return i;
            }
            remain_chalk -= chalk[i];
        }
        return -1;
    }
}