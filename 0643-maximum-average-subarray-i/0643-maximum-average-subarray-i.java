class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum/k;
    }
}