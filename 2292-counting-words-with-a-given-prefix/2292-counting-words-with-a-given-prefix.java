class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            if(isPrefix(words[i],pref)){
                ans+=1;
            }
        }
        return ans;
    } 
    public boolean isPrefix(String word,String pref){
        int l1=word.length();
        int l2=pref.length();
        if(l2>l1){
            return false;
        }
        for(int i=0;i<l2;i++){
            if(word.charAt(i)!=pref.charAt(i)){
                return false;
            }
        }
        return true;
    }
}