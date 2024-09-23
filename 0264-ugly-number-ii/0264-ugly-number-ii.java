class Solution {
    public int nthUglyNumber(int n) {
        int[] u = new int[n];
        u[0] = 1; 
        int index2 = 0, index3 = 0, index5 = 0;
        int nextMultipleOf2 = 2;
        int nextMultipleOf3 = 3;
        int nextMultipleOf5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUglyNumber = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
            u[i] = nextUglyNumber;
            if (nextUglyNumber == nextMultipleOf2) {
                index2++;
                nextMultipleOf2 = u[index2] * 2;
            }
            if (nextUglyNumber == nextMultipleOf3) {
                index3++;
                nextMultipleOf3 = u[index3] * 3;
            }
            if (nextUglyNumber == nextMultipleOf5) {
                index5++;
                nextMultipleOf5 = u[index5] * 5;
            }
        }
        
        return u[n - 1];
    }
}
