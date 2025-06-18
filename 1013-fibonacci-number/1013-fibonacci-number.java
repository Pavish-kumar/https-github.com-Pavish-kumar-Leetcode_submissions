class Solution {
    public int fib(int n) {
        double gr=(1+Math.pow(5,0.5))/2;
        double res=Math.pow(gr,n)/Math.pow(5,0.5);
        return (int)Math.round(res);
    }
}