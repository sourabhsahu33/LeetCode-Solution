class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int n = list.size();
        int mid = n/2;
        if(n % 2 == 0){
            double ans = list.get(mid) + list.get(mid-1);
            return ans/2;
        }else{
            double p = list.get(mid);
            return p;
        }
    }
}