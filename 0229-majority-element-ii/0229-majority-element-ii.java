class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int e1=Integer.MIN_VALUE;
        int e2= Integer.MIN_VALUE;
        int n= nums.length;
        List<Integer> ls=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if(e1==nums[i]){
                c1++;
            } else if (e2==nums[i]) {
                c2++;
            }else if (c1==0 ){
                c1=1;
                e1=nums[i];
            }else if (c2==0 ){
                c2=1;
                e2=nums[i];
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for (int i = 0; i < n; i++) {
            if (nums[i]==e1){
               c1++ ;
            }
            else if(nums[i]==e2){
                c2++;
            }
        }
        int min=(int)(n/3);
        if(c1>min){
            ls.add(e1);
        }
        if(c2>min){
            ls.add(e2);
        }
        ls.sort(null);
        return ls;
    }
}