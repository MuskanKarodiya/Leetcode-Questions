class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max=0;
        for(String ans : sentences){
            int res=ans.split(" ").length;
            if(res>max){
                max=res;
            }
        }
        return max;
    }
}