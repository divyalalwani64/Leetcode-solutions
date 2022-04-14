class Solution {
    public boolean isPowerOfFour(int n) {
        if(n%4==0 && n!=0)
            return isPowerOfFour(n/4);
        boolean res= (n==1);
        return res;
    }
}
