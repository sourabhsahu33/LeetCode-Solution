class Solution {
    public String reorganizeString(String s) {
        if(s.length() == 0) return s;
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
              }

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            maxHeap.add(entry);
        }

        String result = "";
        Map.Entry<Character,Integer> previous = null;
        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            result += entry.getKey();
            entry.setValue(entry.getValue() - 1);
            if(previous != null && previous.getValue() > 0 && previous.getKey() != entry.getKey()) {
                maxHeap.add(previous);
            }
            previous = entry;
        }

        return s.length() == result.length() ? result : "";
    }
}