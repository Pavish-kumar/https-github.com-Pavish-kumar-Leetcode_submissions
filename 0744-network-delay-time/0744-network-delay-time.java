class Solution {
    
    public int total = 0;

    public class Edge {
        int src;
        int nbr;
        int wt;
        
        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        List<Edge>[] graph = new ArrayList[n + 1];
        Set<Integer> set = new HashSet();
        
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList();
        }
        
        for (int[] time : times) {
            int v1 = time[0];
            int v2 = time[1];
            int wt = time[2];
            graph[v1].add(new Edge(v1, v2, wt));
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[n + 1];
        
        pq.add(new Pair(k, 0));
        
        while (!pq.isEmpty()) {
            Pair rem = pq.remove();
            
            if (vis[rem.v]) {
                continue;
            }
            
            vis[rem.v] = true;
            set.add(rem.v);
            total = Math.max(total, rem.wsf);
            
            for (Edge e : graph[rem.v]) {
                if (!vis[e.nbr]) {
                    pq.add(new Pair(e.nbr, rem.wsf + e.wt));
                }
            }
        }
        
        return set.size() == n ? total : -1;
    }
    
    public class Pair implements Comparable<Pair> {
        int v;
        int wsf;
        
        Pair(int v, int wsf) {
            this.v = v;
            this.wsf = wsf;
        }
        
        public int compareTo(Pair o) {
            return this.wsf - o.wsf;
        }
    }
}
