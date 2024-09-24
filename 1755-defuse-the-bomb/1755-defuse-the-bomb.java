class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];
        int n=code.length;
        if(k==0)
        {
            return arr;
        }
        if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                for(int j=1;j<=k;j++)
                {
                    arr[i]=arr[i]+code[(i+j)%code.length];
                }
            }
        }
        else if(k<0)
        {
            k*=-1;
            for(int i=0;i<code.length;i++)
            {
                for(int j=1;j<=k;j++)
                {
                    arr[i]+=code[(i-j+n)%code.length];
                }
            }
        }
        return arr;
    }
}