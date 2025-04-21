class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=0;
        while(i<matrix.length&&j<matrix[0].length){
            if(target>matrix[i][matrix[0].length-1]){
                i++;
            }
            else if(target>matrix[i][j]){
                j++;
            }
            else if(target==matrix[i][j]){
                return true;
            }
            else{
                i++;
                j++;
            }
        }
        return false;
    }
}