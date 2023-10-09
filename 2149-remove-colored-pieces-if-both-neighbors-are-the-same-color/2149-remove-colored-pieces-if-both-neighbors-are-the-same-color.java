class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        if(n<3) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',0);
        map.put('B',0);

        for(int i=0; i<n-2; i++){
            char curr = colors.charAt(i);
            char next1 = colors.charAt(i+1);
            char next2 = colors.charAt(i+2);
        
        if(curr =='A' && next1 == 'A' && next2 == 'A'){
            map.put('A', map.get('A')+1);
        }
        if(curr=='B' && next1=='B' && next2 == 'B'){
            map.put('B', map.get('B')+1);
        }
        }
        if(map.get('A')> map.get('B')){
            return true;
        }
        return false;
    }
}