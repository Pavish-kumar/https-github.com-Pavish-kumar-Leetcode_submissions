class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letter=new HashSet<>();
        for(Character c:s.toCharArray())
        {
            letter.add(c);
        }
        int ans=0;
        for(Character l:letter){
            int i=-1;
            int j=0;
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)==l){
                    if(i==-1){
                        i=k;
                    }
                    j=k;
                }
            }
            Set<Character> b=new HashSet<>();
            for(int k=i+1;k<j;k++){
                b.add(s.charAt(k));
            }
            ans+=b.size();
        }
        return ans;
    }
}