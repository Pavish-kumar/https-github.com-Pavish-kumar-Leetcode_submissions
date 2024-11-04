class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            max=Math.max(max,map.get(i));
        }
        int t=0;
        for(int i:map.keySet())
        {
            if(map.get(i)==max)
            {
                t+=max;
            }
        }
        return t;
    }
}