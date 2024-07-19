class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                list.add(grid[i][j]);
            }
        }
        int temp[] = new int[list.size() + 1];
        Arrays.fill(temp, 0);
        for(int i=0; i<list.size(); i++){
            temp[list.get(i)]++;
        }
        for(int i=1; i<=list.size(); i++){
            if(temp[i] > 1){
                ans[0] = i;
            }
            if(temp[i] == 0){
                ans[1] = i;
            }
        }
        return ans;
    }
}