class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0&&nums[i-1]>=nums[i]){
            i--;
        }
        if(i==0){
            reverse(nums,0,nums.length-1);
            return;
        }
        int j=nums.length-1;
        while(j>=i&&nums[j]<=nums[i-1]){
            j--;
        }
        swap(nums,i-1,j);
        reverse(nums,i,nums.length-1);
    }
    private void reverse(int[] nums,int st,int en){
        while(st<en){
            int temp=nums[st];
            nums[st]=nums[en];
            nums[en]=temp;
            st++;
            en--;
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}