class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] temp = new Integer[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int count_a = Integer.bitCount(a);
            int count_b = Integer.bitCount(b);

            if (count_a == count_b) {
                return Integer.compare(a, b); // Fix the typo here
            }
            return Integer.compare(count_a, count_b);
        });

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}
