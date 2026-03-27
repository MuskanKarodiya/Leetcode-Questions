class Solution {
    public String removeOuterParentheses(String s) {
        String t="";
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt+=1;
                if(cnt>1){
                    t+=s.charAt(i);
                }
            }else{
                cnt-=1;
                if(cnt>0) t+=s.charAt(i);
            }
        }
        return t;
    }
}