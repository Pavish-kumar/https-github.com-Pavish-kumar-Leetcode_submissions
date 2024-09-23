class Solution {
    public int numSquares(int n) {
        int arr []=new int [n+1];
        arr[0]=0;
        arr[1]=1;
        for( int i=2; i<=n; i++)
        {
            int max=Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++)
            {
                int rem=i-j*j;
                if(arr[rem]<max)
                {
                    max=arr[rem];
                }
            }
            arr[i]=max+1;
        }
        return arr[n];
    }
}