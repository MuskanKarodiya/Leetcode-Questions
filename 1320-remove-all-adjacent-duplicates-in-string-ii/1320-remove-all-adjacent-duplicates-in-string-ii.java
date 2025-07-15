class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack=new Stack<>();
        Stack<Integer> count=new Stack<>();

        for(char ch : s.toCharArray()){
            if(stack.size()>0 && stack.peek()==ch){
                count.push(count.peek()+1);
            }else{
                count.push(1);
            }
            stack.push(ch);
            if(count.peek()==k){
                for(int i=0;i<k;i++){
                    stack.pop();
                    count.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()>0) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}