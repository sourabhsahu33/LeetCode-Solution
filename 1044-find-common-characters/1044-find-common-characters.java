
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[] charCount = new int[26];
        
        // Initialize charCount with maximum possible value
        Arrays.fill(charCount, Integer.MAX_VALUE);
        
        // Iterate through each word and update charCount array
        for (String word : words) {
            int[] currCount = new int[26];
            for (int i = 0; i < word.length(); i++) {
                currCount[word.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                charCount[i] = Math.min(charCount[i], currCount[i]);
            }
        }
        
        // Add common characters to the result list
        for (int i = 0; i < 26; i++) {
            while (charCount[i]-- > 0) {
                result.add(Character.toString((char) ('a' + i)));
            }
        }
        
        return result;
    }
}
