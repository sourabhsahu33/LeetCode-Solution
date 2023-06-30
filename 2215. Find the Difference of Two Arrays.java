class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0 ; i < nums1.length; i ++){
            set1.add(nums1[i]);
        }
        ////Iterate through nums2 and add each element to set2 using the add method of the hash set
        for(int i = 0 ; i < nums2.length; i ++){
            set2.add(nums2[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        //Iterate through nums1 and check if each element is not present in set2 and is not already in list1
        for(int i = 0 ; i < nums1.length; i ++){
            if(!set2.contains(nums1[i]) && !list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        ans.add(list1); //Add list1 to the ans list of lists
        List<Integer> list2 = new ArrayList<>();
        //Iterate through nums2 and check if each element is not present in set1 and is not already in list2
        for(int i = 0 ; i < nums2.length; i ++){
            if(!set1.contains(nums2[i]) && !list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        ans.add(list2); //Add list2 to the ans list of lists
        return ans;
    }
}
