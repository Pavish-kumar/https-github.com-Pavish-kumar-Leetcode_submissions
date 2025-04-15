class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int index=nums.length-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            if(Math.abs(nums[l])<Math.abs(nums[r])){
                result[index--]=nums[r]*nums[r];
                r--;
            }
            else{
                result[index--]=nums[l]*nums[l];
                l++;
            }
        }
        return result;
    }
}