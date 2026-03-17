class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum= n*(n+1)/2;
        int ss=0;
        for(int s:nums){
            ss+=s;
        }
        return sum-ss;
    }
}