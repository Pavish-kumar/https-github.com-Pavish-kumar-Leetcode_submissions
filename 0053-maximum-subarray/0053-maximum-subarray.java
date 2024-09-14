class Solution {
    public int maxSubArray(int[] nums) {
        int r=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(sum<0)
            {
                sum=0;
            }
           sum+=nums[i];
           r=Math.max(r,sum);

        }
        return r;
    }
}