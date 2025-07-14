class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(0); // marker for '('
            } else {
                if (stack.peek() == 0) {
                    stack.pop();
                    stack.push(1); // '()' contributes 1
                } else {
                    int sum = 0;
                    while (stack.peek() != 0) {
                        sum += stack.pop();
                    }
                    stack.pop(); // remove the 0 marker
                    stack.push(2 * sum); // (A) contributes 2*A
                }
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
