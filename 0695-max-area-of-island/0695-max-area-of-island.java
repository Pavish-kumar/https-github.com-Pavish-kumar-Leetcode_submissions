class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    maxArea=Math.max(maxArea,dfs(grid,i,j));
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,int i,int j){
        if(i>=grid.length||i<0||j<0||j>=grid[0].length||grid[i][j]!=1){
            return 0;
        }
        grid[i][j]=0;
        int area=1;
        area+=dfs(grid,i-1,j);
        area+=dfs(grid,i+1,j);
        area+=dfs(grid,i,j-1);
        area+=dfs(grid,i,j+1);
        return area;
    }
}