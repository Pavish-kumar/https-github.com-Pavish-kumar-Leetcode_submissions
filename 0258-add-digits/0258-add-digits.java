class Solution {
    public int addDigits(int num) {
        int res=num;
        while(res>9)
        {
            res=sumof(res);
        }
        return res;
    }
    public int sumof(int n)
    {
        int res=0;
        while(n!=0)
        {
            int r=n%10;
            n/=10;
            res+=r;
        }
        return res;
    }
}