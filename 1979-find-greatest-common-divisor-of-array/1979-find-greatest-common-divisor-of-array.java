class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s=nums[0];
        int l=nums[nums.length-1];
        while(s!=0){
            int temp=l%s;
            l=s;
            s=temp;
        }
        return l;
    }
}