class Solution {
    public int addDigits(int num) {
        int add = 0;
      while(num>0){
          add += num%10;
          num /=10;
      }
        if(add<10)
            return add;
        else
            return addDigits(add);
    }
}