class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    String temp="("+board[i][j]+")";
                    if(!set.add(temp+i)||!set.add(j+temp)||!set.add(i/3+temp+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}