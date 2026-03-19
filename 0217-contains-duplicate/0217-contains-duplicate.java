class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1) return false;
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            if(set.contains(n)) return true;
            else{
                set.add(n);
            }
        }
        return false;
    }
}