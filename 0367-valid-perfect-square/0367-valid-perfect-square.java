class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1;
        long r=num;
        while(l<=r){
            long m=(l+r)/2;
            long ms=m*m;
            if(ms==num){
                return true;
            }
            else if(ms<num){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return false;
    }
}