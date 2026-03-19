class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if (s.isEmpty()) return 0;
        int res=0;
        int sign=1;
        int i=0;
        if(s.charAt(i)=='-'){ 
            sign=-1;
            i=1;
        }
        else if(s.charAt(i)=='+'){ 
            sign=1;
            i=1;
        }
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') break;

            int digit = c - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
        }

        return res * sign;
    }
}