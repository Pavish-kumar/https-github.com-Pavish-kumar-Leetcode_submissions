class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] ed:edges){
            int i=ed[0],j=ed[1];
            graph.get(i).add(j);
            graph.get(j).add(i);
        }
        boolean[] visit=new boolean[n];
        return dfs(graph,source,destination,visit);
    }
    public boolean dfs(List<List<Integer>> graph,int c,int d,boolean[] visit){
        if(c==d){
            return true;
        }
        visit[c]=true;
        for(int n:graph.get(c)){
            if(!visit[n]){
                if(dfs(graph,n,d,visit)){
                    return true;
                }
            }
        }
        return false;
    }
}