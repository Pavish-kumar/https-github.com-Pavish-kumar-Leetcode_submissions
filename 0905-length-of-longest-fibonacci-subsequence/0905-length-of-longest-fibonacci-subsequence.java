class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length, ans = 0;
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < n; i++) index.put(arr[i], i);
        int[][] dp = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                int kVal = arr[j] - arr[i];
                if (kVal >= arr[i]) continue;
                Integer k = index.get(kVal);
                if (k != null) {
                    dp[i][j] = dp[k][i] > 0 ? dp[k][i] + 1 : 3;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }
}