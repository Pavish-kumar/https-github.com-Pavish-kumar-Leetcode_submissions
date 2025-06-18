class Solution {
  public int fib(int n) {
    if (n <= 1) {
        return n;
    }
    double sqrt5 = Math.sqrt(5);
    double phi = (1 + sqrt5) / 2;
    double psi = (1 - sqrt5) / 2;
    double result = (Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5;
    return (int)Math.round(result);
  }
}