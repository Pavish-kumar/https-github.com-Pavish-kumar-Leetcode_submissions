class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i] == false) {
                for (int j = 2 * i; j <= right; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        List<Integer> primeNums = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime[i] == false) {
                primeNums.add(i);
            }
        }
        if (primeNums.size() < 2)
            return new int[] { -1, -1 };
        int[] res = new int[2];
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < primeNums.size(); i++) {
            int num1 = primeNums.get(i - 1);
            int num2 = primeNums.get(i);
            int diff = num2 - num1;
            if (diff < minDiff) {
                minDiff = diff;
                res[0] = num1;
                res[1] = num2;
            }
        }
        return res;
    }
}