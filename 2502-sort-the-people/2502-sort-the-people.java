class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0; i<names.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String ans[] = new String[names.length];
        int idx=0;
        for(int i=names.length-1; i>=0; i--){
            ans[idx++] = map.get(heights[i]);
        }
        return ans;
    }
}