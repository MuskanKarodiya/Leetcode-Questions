class Solution {
    public int maxSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int s:nums){
            max=Math.max(max,s);
        }
        if(max<=0) return max;
        Set<Integer> un=new HashSet<>();
        for(int n:nums){
            un.add(n);
        }
        int sum=0;
        for(int v:un){
            if(v>0){
                sum+=v;
            }
        }
        return sum;
    }
}