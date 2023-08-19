class Solution {
    public void nextPermutation(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
 
        int n = list.size();
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            Collections.reverse(list);
        } else {
            for (int i = n - 1; i > ind; i--) { // Changed i++ to i--
                if (list.get(i) > list.get(ind)) { // Changed <= to >
                    Collections.swap(list, i, ind);
                    break;
                }
            }
            Collections.reverse(list.subList(ind + 1, n));
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);
        }
    }
}
