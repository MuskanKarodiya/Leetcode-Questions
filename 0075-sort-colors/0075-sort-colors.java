class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int curr=0;
        int end=nums.length-1;
        while(curr<=end){
            if(nums[curr]==0) {
                swap(nums,start,curr);
                curr++;
                start++;
            }else if(nums[curr]==1){
                    curr++;
            }else if(nums[curr]==2){
                swap(nums,curr,end);
                end--;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;

    }
}