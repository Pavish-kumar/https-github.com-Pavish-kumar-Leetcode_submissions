class Solution {
    public void solveSudoku(char[][] board) {
         solved(board);
    }
    boolean solved(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.') continue;
                for(char num='1'; num<='9'; num++){
                    if(isValid(board, i, j, num)){
                        board[i][j] = num;
                        if(solved(board)) return true;
                        else board[i][j] = '.';
                    }
                }
                return false;
            }
          
        }
        return true;
    }
    boolean isValid(char[][] board, int row, int col, char num){
        int blockrow = (row/3)*3, blockcol = (col/3)*3;
        for(int i=0; i<9; i++){
          if(board[row][i] == num) return false;
          if(board[i][col] == num) return false;
          if(board[blockrow+i/3][blockcol+i%3] == num) return false;
        }
        return true;
    }
}