class Solution {
    public int arraySign(int[] nums) {
        //int x =1;
        int negative = 0;
       for(int arr : nums){
           if(arr==0) return 0;
           else if(arr<0){
               negative++;
           }
       }
      if(negative %2==0)return 1;
        else return -1;
    }
}