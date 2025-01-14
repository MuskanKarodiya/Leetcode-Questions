class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int chosen=-1;
        for(int i=n-1; i>0;i--){
            if(nums[i]>nums[i-1]){
                chosen=i-1;
                break;
            }
        }
        if(chosen !=-1){
            int swap_i= chosen;
            for(int j=n-1; j>= chosen+1;j--){
                if(nums[j]>nums[chosen]){
                    int temp = nums[chosen];
                    nums[chosen] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        reverse(nums, chosen + 1, n - 1);
    }    
        public void reverse(int [] nums, int start ,int end){
            while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}