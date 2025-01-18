class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0});
        int[][] cost = new int[m][n];
        for (int[] row : cost) {
            java.util.Arrays.fill(row, Integer.MAX_VALUE);
        }
        cost[0][0] = 0;
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentCost = current[0];
            int x = current[1];
            int y = current[2];
            if (x == m - 1 && y == n - 1) {
                return currentCost;
            }
            for (int i = 0; i < 4; i++) {
                int newX = x + directions[i][0];
                int newY = y + directions[i][1];
                int newCost = (grid[x][y] == i + 1) ? currentCost : currentCost + 1;
                if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                    if (newCost < cost[newX][newY]) {
                        cost[newX][newY] = newCost;
                        pq.offer(new int[]{newCost, newX, newY});
                    }
                }
            }
        }
        
        return -1;
    }
}