class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts=new int[26];
        int l=0,r=0;
        int longest=Integer.MIN_VALUE;
        while(r<s.length()){
            counts[s.charAt(r)-65]++;
            while((r-l+1)-Arrays.stream(counts).max().getAsInt()>k){
                counts[s.charAt(l++)-65]--;
            }
            longest=Math.max(longest,(r-l+1));
            r++;
        }
        return longest;

    }
}