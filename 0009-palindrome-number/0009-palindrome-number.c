bool isPalindrome(int x) {
    int r=0;
    int x1=x;
    if(x<0)
    {
        return false;
    }
    while(x1!=0)
    {
        int d=x1%10;
        if(r>(INT_MAX-d)/10)
        {
            return false;
        }
        r=(r*10)+d;
        x1/=10;
    }
    return x==r;
}