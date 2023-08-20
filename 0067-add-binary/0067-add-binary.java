
class Solution {
    public String addBinary(String a, String b) {
        java.math.BigInteger n1 = new java.math.BigInteger(a,2);
        java.math.BigInteger n2 = new java.math.BigInteger(b,2);
        java.math.BigInteger add = n1.add(n2); 
        return add.toString(2);       
    }
}