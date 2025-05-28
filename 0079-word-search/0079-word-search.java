class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        if(word.length()>m*n){
            return false;
        }
        boolean[][] visit=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper(board,word,i,j,0,visit)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean helper(char[][] board, String word,int i,int j,int index,boolean[][] visited){
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||visited[i][j]||board[i][j]!=word.charAt(index)){
            return false;
        }
        visited[i][j]=true;
        boolean found=helper(board,word,i+1,j,index+1,visited)||
        helper(board,word,i-1,j,index+1,visited)||
        helper(board,word,i,j+1,index+1,visited)||
        helper(board,word,i,j-1,index+1,visited);
        visited[i][j]=false;
        return found;
    }
}