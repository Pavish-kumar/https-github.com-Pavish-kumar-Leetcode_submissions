class DisjointSet{
    int[] size;
    int[] parent;
    
    public DisjointSet( int n ){
        size = new int[n];
        parent = new int[n];
        for( int i = 0; i < n; i++ ){
            parent[i] = i;
            size[i] = 1;
        }
    }
    
    public int find(int u){
        if(parent[u] != u){
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }
    
    public void union(int u, int v){
        int pv = find(v);
        int pu = find(u);
        if(pu == pv)return ;
        if(size[pu] >= size[pv]){
            parent[pv] = pu;
            size[pu] += size[pv];
        }else{
            parent[pu] = pv;
            size[pv] += size[pu];
        }
    }
}

class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int drow[] = {-1, 0, 1, 0};
        int[] dcol = {0, -1, 0, 1};
        DisjointSet d = new DisjointSet(n*m);
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 0)continue;
                res++;
                int u = i*m+j;
                for(int k=0;k<4;k++){
                    int row = i+drow[k];
                    int col = j+dcol[k];
                    if(row>=0 && row<n && col>=0 && col<m && grid[row][col] == 1){
                        int v = row*m+col;
                        if(d.find(u) != d.find(v)){
                            d.union(u, v);
                        }
                    }
                }
            }
        }

        if(res == n*n)return res;
        res = 0;

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    int count = 1;
                    HashSet<Integer> set = new HashSet<>();
                    for(int k=0;k<4;k++){
                        int row = i+drow[k];
                        int col = j+dcol[k];
                        if(row>=0 && row<n && col>=0 && col<m && grid[row][col] == 1){
                            int v = row*m+col;
                            int pv = d.find(v);
                            if(!set.contains(pv)){
                                set.add(pv);
                                count+=d.size[pv];
                            }
                        }
                    }
                    res = Math.max(res, count);
                }
            }
        }

        return res;
    }
}