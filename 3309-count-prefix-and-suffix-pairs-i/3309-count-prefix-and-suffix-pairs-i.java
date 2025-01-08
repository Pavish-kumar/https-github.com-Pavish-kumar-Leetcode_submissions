class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    ans+=1;
                }
            }
        }
        return ans;
    }
    public boolean isPrefixAndSuffix(String a,String b){
        int l1=a.length();
        int l2=b.length();
        if(l1>l2){
            return false;
        }
        for(int i=0;i<l1;i++){
            if(a.charAt(i)!=b.charAt(i)||a.charAt(i)!=b.charAt(l2-l1+i)){
                return false;
            }
        }
        return true;
    }
}