class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] wf1=new int[26];
        int[] wf2=new int[26];
        for(char c:word1.toCharArray()){
            wf1[c-'a']++;
        }
        for(char c:word2.toCharArray()){
            wf2[c-'a']++;
        }
        int diff=0;
        for(int i=0;i<26;i++){
            if(Math.abs(wf1[i]-wf2[i])>3){
                return false;
            }
        }
        return true;
    }
}