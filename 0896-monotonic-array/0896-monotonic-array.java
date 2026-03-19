class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;
        for(int i=1;i<nums.length;i++){
            if(!inc && !dec) return false;
            if(nums[i]>nums[i-1]) dec=false;
            if(nums[i]<nums[i-1]) inc=false;
        }
        return inc || dec;
    }
}