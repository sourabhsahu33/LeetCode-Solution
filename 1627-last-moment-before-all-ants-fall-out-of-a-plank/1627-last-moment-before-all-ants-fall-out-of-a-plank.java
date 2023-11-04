class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int last_move = 0;
        for(int l : left){
            last_move = Math.max(last_move, l);
        }
        for(int r : right){
            last_move = Math.max(last_move, n-r);
        }
        return last_move;
    }
}