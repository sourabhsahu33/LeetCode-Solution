class Solution {
  public static void rotate(int[] nums, int k) {
    if (nums == null || nums.length == 0 || k == 0) {
        return;
    }
    int n = nums.length;
    k %= n;
    reverse(nums, 0, n - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, n - 1);
}

public static void reverse(int[] nums, int i, int j) {
    while (i < j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
       i++;
       j--;
    }
}

}