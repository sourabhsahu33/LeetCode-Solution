class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int card: hand){
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
         while (!map.isEmpty()) {
            int first = map.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int card = first + i;
                if (!map.containsKey(card)) {
                    return false;
                }
                int count = map.get(card);
                if (count == 1) {
                    map.remove(card);
                } else {
                    map.put(card, count - 1);
                }
            }
        }
        return true;
    }
}