class Solution {
    public int vowelStrings(String[] words, int left, int right){
        String v="AEIOUaeiou";
        int n=0;
        for(int i=left;i<=right;i++){
            if(v.contains(String.valueOf(words[i].charAt(0)))&&v.contains(String.valueOf(words[i].charAt(words[i].length()-1)))){
                n++;
            }
        }
        return n;
    }
}