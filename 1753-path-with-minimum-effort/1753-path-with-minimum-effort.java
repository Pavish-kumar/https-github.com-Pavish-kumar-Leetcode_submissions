class Solution {
    public class pair{
        int w;
        int r;
        int c;
        pair(int w,int r,int c)
        {
            this.w=w;
            this.r=r;
            this.c=c;
        }
    }
    public int minimumEffortPath(int[][] heights) {
         boolean [][] vis = new boolean[heights.length][heights[0].length];
         PriorityQueue<pair> st= new PriorityQueue<>((a,b)->a.w-b.w);
         st.add(new pair(0,0,0));

        while(st.size()>0)
        {
            pair s= st.remove();
            int effort= s.w;
            int src1= s.r;
            int src2= s.c;
            if(src1==heights.length-1 && src2== heights[0].length-1)
            {
                return effort;
            }

          int dir[][]= {{0,1},{0,-1},{1,0},{-1,0}};

            if(vis[src1][src2]!=true)
                   {
                 vis[src1][src2]=true;  
                 for(int i=0;i<4;i++)
                 {
                    // System.out.print("yes");
                    int dx= src1+dir[i][0];
                    int dy= src2+dir[i][1];
                  if((dx>=0 && dy>=0 && dx<heights.length && dy<heights[0].length  && vis[dx][dy]!=true))
                  {
                    int nef = Math.max(effort,Math.abs(heights[dx][dy]-heights[src1][src2]));
                    st.add(new pair(nef,dx,dy));
                  }
                 }

            }     

        }


     return 3;   
    }
}
