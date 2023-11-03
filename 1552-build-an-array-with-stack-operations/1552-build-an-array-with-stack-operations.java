class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int j=0;
        for(int i=1; i<=n; i++){
                if( j >= target.length)
                break;

                if(target[j] == i){
                    list.add("Push");
                    j++;
                }else{
                    list.add("Push");
                    list.add("Pop");
                }
        }
        return list;
    }
}