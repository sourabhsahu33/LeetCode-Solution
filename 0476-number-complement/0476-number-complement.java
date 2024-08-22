class Solution {
    public int findComplement(int num) { 

        int highestBit = Integer.highestOneBit(num);

        int mask = (highestBit << 1) - 1;

        return num^mask;
        
    }
}