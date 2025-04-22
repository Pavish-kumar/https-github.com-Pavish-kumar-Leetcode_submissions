class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=(l+r)/2;
        if(nums[0]>target){
            return 0;
        }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        while(l<=r){
            mid=(l+r)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
        }
        return l;
    }
}