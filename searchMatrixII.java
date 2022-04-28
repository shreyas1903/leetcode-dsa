class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        for(int i =0; i < matrix.length; i++){
            if(matrix[i][0] > target){
                row =i-1;
                break;
            }
            if(matrix[i][0] == target){
                return true;
            }
            row = i;
            if(row == -1){
                row = 0;
            }
            for(int j =0; j < matrix[0].length; j++){
                if(matrix[row][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
