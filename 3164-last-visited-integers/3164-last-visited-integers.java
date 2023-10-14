class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        ArrayList<Integer> num = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int c = 0;
        for(int i=0; i<words.size(); i++){
            if(words.get(i).equals("prev")){
                if(c<num.size()){
                    ans.add(num.get(num.size()-1-c));
                }else{
                    ans.add(-1);
                }
            c++;
            }else{
                int nums = Integer.valueOf(words.get(i));
                num.add(nums);
                c = 0;
            }
        }
        return ans;
    }
}