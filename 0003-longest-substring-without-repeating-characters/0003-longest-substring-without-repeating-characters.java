class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int l=0;
        int ind=0;
        for(char c:s.toCharArray()){
            while(set.contains(c)){
                set.remove(s.charAt(ind++));
            }
            set.add(c);
            l=Math.max(l,set.size());
        }
        return l;
    }
}