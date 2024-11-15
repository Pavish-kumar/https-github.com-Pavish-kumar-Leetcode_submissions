class Solution {
    public List<List<String>> solveNQueens(int n) {
        final List<List<String>> result = new ArrayList<>();
        
        this.helper(result, new ArrayList<>(), new boolean[n * 2], new boolean[n * 2], new boolean[n], 0, n);

        return result;
    }

    private void helper(final List<List<String>> result, final List<String> arr, final boolean[] diag1, final boolean[] diag2, final boolean[] col, final int row, final int n) {
        if(row == n) {
            result.add(new ArrayList<>(arr));
        } else {
            for(int i = 0; i < n; ++i) {
                if(!col[i] && !diag1[row + i] && !diag2[n + row - i]) {
                    char[] chars = new char[n];

                    Arrays.fill(chars, '.');
                    chars[i] = 'Q';

                    diag1[row + i] = true;
                    diag2[n + row - i] = true;
                    col[i] = true;
                    arr.add(new String(chars));

                    helper(result, arr, diag1, diag2, col, row + 1, n);

                    diag1[row + i] = false;
                    diag2[n + row - i] = false;
                    col[i] = false;
                    arr.remove(arr.size() - 1);
                }
            }
        }
    }
}