class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result=new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        int i=0,j=0;
        while(i<len1&&j<len2){
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        while(i<len1){
            result.append(word1.charAt(i++));
        }
        while(j<len2){
            result.append(word2.charAt(j++));
        }
        return result.toString();
    }
}