class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ls=0;
        for(int s:set){
            if(!set.contains(s-1)){
                int current=0;
                int cn=s;
                while(set.contains(cn)){
                    current+=1;
                    cn+=1;
                }
                ls=Math.max(ls,current);
            }
        }
        return ls;
    }
}