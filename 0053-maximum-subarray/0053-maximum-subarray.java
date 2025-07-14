class Solution {
    public int maxSubArray(int[] nums) {
        int max=0,sum=0;
        for(int i:nums){
            if(sum<0){
                sum=0;
            }
            sum+=i;
            max=Math.max(max,sum);
        }
        return max;
    }
}