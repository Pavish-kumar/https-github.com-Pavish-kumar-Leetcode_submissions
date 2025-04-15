class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:t.toCharArray()){
            arr[c-'a']--;
            if(arr[c-'a']<0){
                return false;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }
}