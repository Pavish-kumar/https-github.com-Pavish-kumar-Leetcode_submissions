class Solution {
    public int majorityElement(int[] nums) {
        int count=0,can=nums[0];
        for(int n:nums){
            if(count==0){
                can=n;
            }
            count+=(n==can)?1:-1;
        }
        return can;
    }
}