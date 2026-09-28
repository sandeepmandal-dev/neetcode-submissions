class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int endCol=matrix[0].length-1;
        int startRow=0;

        while(startRow<matrix.length && endCol>=0){
            if(matrix[startRow][endCol]==target){
                return true;
            }else if(matrix[startRow][endCol]>target){
                endCol--;
            }else{
                startRow++;
            }
        }

        return false;
    }
}
