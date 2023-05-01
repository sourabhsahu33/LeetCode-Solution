class Solution {
    public double average(int[] salary) {
         int n= salary.length;
        double sum = 0;
        int count =0;
         Arrays.sort(salary);
       for(int i=1; i<n-1; i++){   
           sum +=salary[i];
           count++;
       }
        sum = sum/count;
        return sum;
    }
}