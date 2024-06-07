class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left =0, right=m-1;
        int top=0, botom=n-1; 
        ArrayList<Integer> ans = new ArrayList<>();
        while(top<=botom && left<=right){
        for(int i=left; i<=right; i++){
            ans.add(matrix[top][i]);
        }
            top++;
        for(int i=top; i<=botom; i++){
            ans.add(matrix[i][right]);
        }
            right--;
            if(top<=botom){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[botom][i]);
                }
                botom--;
            }
            if(left<=right){
                for(int i=botom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}