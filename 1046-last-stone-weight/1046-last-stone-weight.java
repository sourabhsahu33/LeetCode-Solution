class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int x : stones){
            maxHeap.add(-x);
        }
        while(maxHeap.size()> 1){
            int stone1 = -maxHeap.remove();
            int stone2 = -maxHeap.remove();
            if(stone1 != stone2){
                maxHeap.add(-(stone1-stone2));
            }
        }   
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }
}