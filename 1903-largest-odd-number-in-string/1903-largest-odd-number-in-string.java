class Solution {
    public String largestOddNumber(String num) {
        int r=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                r=i;
                break;
            }
        }
        if (r==-1) return "";
        int l=0;
        while(l<r && num.charAt(l)==0){
            l++;
        }
    
        return num.substring(l,r+1);
    }
}