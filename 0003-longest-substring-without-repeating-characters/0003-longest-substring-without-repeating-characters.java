class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index=0;
        Set<Character> set=new HashSet<>();
        int i=0,max=0;
        while(i<s.length()){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(index++));
            }
            set.add(c);
            max=Math.max(max,set.size());
            i++;
        }
        return max;
    }
}