class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums1.length; i++){
//             for(int j=0; j<nums2.length; j++){
//                 if(nums1[i]== nums2[j])
//                     set.add(nums1[i]);
               
//             }
//         }
//         for(int i: set){
//             return i;
//         }
//         return -1;
        
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j])
                return nums1[i];
            else if(nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        return -1;
    }
}