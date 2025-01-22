class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int vote=1;
        for(int i=1;i<nums.length;i++){
            if (vote==0){
                vote=1;
                maj=nums[i];
            }else if(maj==nums[i]){
                vote++;
            }else{
                vote--;
            }
        }
        return maj;
    }
}