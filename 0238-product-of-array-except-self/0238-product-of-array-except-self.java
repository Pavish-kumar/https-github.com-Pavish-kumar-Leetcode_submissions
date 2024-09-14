class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=nums[i-1]*ans[i-1];
        }
        int sp=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=sp;
            sp*=nums[i];
        }
        return ans;
    }
}