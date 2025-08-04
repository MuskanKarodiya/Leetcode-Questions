class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int plen=p.length();
        char[] parr=p.toCharArray();
        Arrays.sort(parr);
        for(int i=0;i<=s.length()-plen;i++){
            String sub=s.substring(i,i+plen);
            char[] subarr=sub.toCharArray();
            Arrays.sort(subarr);
            if(Arrays.equals(subarr,parr)){
                res.add(i);
            }
        }
        return res;
    }
}