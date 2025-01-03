class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=0;
        long fs=0,bs=0;
        for(int num:nums)
        {
            bs+=num;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            fs+=nums[i];
            bs-=nums[i];
            if(fs>=bs){
                n++;
            }
        }
        return n;
       
    }
}