class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int v=1;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        while(top<=bottom&&left<=right&&v<=(n*n))
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=v;
                v++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]=v;
                v++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    arr[bottom][i]=v;
                    v++;
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    arr[i][left]=v;
                    v++;
                }
                left++;
            }
        }
        System.gc();
        return arr;
    }
}