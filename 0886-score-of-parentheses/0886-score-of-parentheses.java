class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int cur=0;
        for (char ch : s.toCharArray()) {
           if(ch=='('){
            stack.push(cur);
            cur=0;
           }else{
            cur=stack.pop() + Math.max(2*cur,1);
           } 
        }
        return cur;
    }
}
