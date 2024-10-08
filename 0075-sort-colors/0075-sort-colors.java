class Solution {
    public void sortColors(int[] nums) {
        TreeMap<Integer,Integer> t=new TreeMap<>();
        for(int num:nums)
        {
            t.put(num,t.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int s:t.keySet())
        {
            int c=t.get(s);
            while(c>0)
            {
                nums[index++]=s;
                c--;
            }
        }
    }
}