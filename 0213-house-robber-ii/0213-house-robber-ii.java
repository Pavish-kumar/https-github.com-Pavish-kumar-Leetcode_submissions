class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return nums[0];
        }
        return Math.max(helper(nums,0,n-2),helper(nums,1,n-1));
    }
    private int helper(int[] nums, int start, int end) {
        int prevRob = 0, maxRob = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(maxRob, prevRob + nums[i]);
            prevRob = maxRob;
            maxRob = temp;
        }
        return maxRob;
    }    
}