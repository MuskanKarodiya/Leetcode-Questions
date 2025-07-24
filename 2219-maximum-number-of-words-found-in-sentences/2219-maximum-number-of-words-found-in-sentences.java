class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max=0;

        for(String sentence:sentences){
            sentence=sentence.trim();
        

            if(sentence.isEmpty()){
               continue;
            }
            String[] words=sentence.split("\\s+");
            max=Math.max(max,words.length);

        }
        return max;
    }
}