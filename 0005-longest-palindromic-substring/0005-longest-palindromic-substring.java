class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        int st=0,en=0;
        for(int i=0;i<s.length();i++){
            int odd=helper(s,i,i);
            int even=helper(s,i,i+1);
            int maxl=Math.max(odd,even);
            if(maxl>en-st){
                st=i-(maxl-1)/2;
                en=i+maxl/2;
            }
        }
        return s.substring(st,en+1);
    }
    public int helper(String s,int l,int r){
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}