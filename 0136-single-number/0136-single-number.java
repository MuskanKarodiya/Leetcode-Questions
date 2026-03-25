class Solution {
    public int singleNumber(int[] nums) {
        int xorr=0;
        for(int n:nums){
            xorr^=n;
        }
        return xorr;
    }
}