class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int m_len=0;
        List<Character> list=new ArrayList<>();
        while(end<s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                m_len = Math.max(m_len, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return m_len;
    }
}