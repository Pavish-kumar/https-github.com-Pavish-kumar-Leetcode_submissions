class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++)
        {
            if(isPrime(nums[i][i]))
            {
                max=Math.max(max,nums[i][i]);
            }
            if(isPrime(nums[i][n-i]))
            {
                max=Math.max(max,nums[i][n-i]);
            }
        }
        System.gc();
        return max == Integer.MIN_VALUE ? 0 : max;
    }
    public boolean isPrime(int num)
    {
        
        if(num<=1)
        {
            return false;
        }
        if(num<=3)
        {
            return true;
        }
        if(num%2==0||num%3==0)
        {
            return false;
        }
        for(int i=5;i*i<=num;i+=6)
        {
            if(num%i==0||num%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
}