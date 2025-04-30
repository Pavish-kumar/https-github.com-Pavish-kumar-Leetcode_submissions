class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts=new int[26];
        int l=0,r=0,maxC=0;
        int longest=Integer.MIN_VALUE;
        while(r<s.length()){
            counts[s.charAt(r)-65]++;
            maxC = Math.max(maxC, counts[s.charAt(r) - 'A']);

            while((r-l+1)-maxC>k){
                counts[s.charAt(l++)-65]--;
            }
            longest=Math.max(longest,(r-l+1));
            r++;
        }
        return longest;

    }
}