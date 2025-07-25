class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        int idx=0;
        for(int i=0;i<h;i++){
            if(haystack.charAt(i)==needle.charAt(idx)) {
                idx++;
            }else{
                i=i-idx;
                idx=0;
            }
            if(idx==n){
                return i-n+1;
            }
        }
        return -1;
    }
}