class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int left=0,right=numbers.length-1;
        while(left<right){
            while(numbers[left]+numbers[right]<target){left++;}
            while(numbers[left]+numbers[right]>target){right--;}
            if(numbers[left]+numbers[right]==target){return new int[]{left+1,right+1};}
        }
        return new int[]{};
    }
}