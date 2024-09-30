class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] s=new boolean[nums.length+1];
        for(int num:nums)
        {
            if(s[num]==true)
            {
                return num;
            }
            s[num]=true;
        }
        return -1;
    }
}