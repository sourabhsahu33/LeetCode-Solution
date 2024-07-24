class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        List<Pair> vec = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String numStr = Integer.toString(nums[i]);
            String mappedStr = getMappedNum(numStr, mapping);
            int mappedNum = Integer.parseInt(mappedStr);
            vec.add(new Pair(mappedNum, i));
        }

        Collections.sort(vec, (a, b) -> Integer.compare(a.mappedNum, b.mappedNum));
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int originalNumIdx = vec.get(i).originalIdx;
            result[i] = nums[originalNumIdx];
        }

        return result;
    }

    private String getMappedNum(String num, int[] mapping) {
        StringBuilder mappedNum = new StringBuilder();
        for (char ch : num.toCharArray()) {
            mappedNum.append(mapping[ch - '0']);
        }
        return mappedNum.toString();
    }

    private static class Pair {
        int mappedNum;
        int originalIdx;

        Pair(int mappedNum, int originalIdx) {
            this.mappedNum = mappedNum;
            this.originalIdx = originalIdx;
        }
    }
}