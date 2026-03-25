class Solution {
    public String reverseWords(String s) {
        String [] arr=s.trim().split("\\s+");
        int i=0;
        for(int j=arr.length-1;j>=arr.length/2;j--){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
        String n=String.join(" ",arr);
        return n;
    }
}