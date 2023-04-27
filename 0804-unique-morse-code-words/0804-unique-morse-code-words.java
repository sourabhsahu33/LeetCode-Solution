class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String [] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Boolean> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            String check = "";
            for(int j=0; j<words[i].length(); j++){
                check += arr[words[i].charAt(j)- 'a'];
            }
            map.put(check, true);
        }
        return map.size();
    }
}