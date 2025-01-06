class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] sf=new int[26];
        int[] tf=new int[26];
        for(char c:s.toCharArray()){
            sf[c-'a']++;
        }
        for(char c:target.toCharArray()){
            tf[c-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(char c:target.toCharArray()){
            if(tf[c-'a']>0){
                min=Math.min(min,sf[c-'a']/tf[c-'a']);
            }
        }
        return min;
    }
}