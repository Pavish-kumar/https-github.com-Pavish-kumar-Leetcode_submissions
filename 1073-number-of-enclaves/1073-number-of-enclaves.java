class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || i == rows - 1 || j == 0 || j == cols - 1) && grid[i][j] == 1) {
                    q.offer(new int[]{i, j});
                    grid[i][j] = 0;
                }
            }
        }
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0], col = cell[1];
            for (int k = 0; k < 4; k++) {
                int newRow = row + dRow[k];
                int newCol = col + dCol[k];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                    q.offer(new int[]{newRow, newCol});
                    grid[newRow][newCol] = 0; 
                }
            }
        }
        int enclaves = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    enclaves++;
                }
            }
        }
        return enclaves;
    }
}
