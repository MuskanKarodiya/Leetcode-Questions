class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int miss=0;
        int arrsum=0;
        for(int ele:nums){
            arrsum+=ele;
        }
        miss=sum-arrsum;
        return miss;
    }
}