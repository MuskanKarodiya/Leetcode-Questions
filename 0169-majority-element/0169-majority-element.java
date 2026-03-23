class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        int maj=0;
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
            if(map.get(e)>maj){
                res=e;
                maj=map.get(e);
            }
        }
        return res;
    }
}