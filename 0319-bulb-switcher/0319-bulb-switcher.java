class Solution {
    public int bulbSwitch(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        
//        double s = Math.sqrt(n);
//         return (int)s;
        
        return (int)Math.sqrt(n);
        
    }
}

// Tc = O(root(n))
// SC = O(n)