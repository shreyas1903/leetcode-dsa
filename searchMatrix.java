class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        for(int i =0; i < matrix.length;i++){
            if(target < matrix[i][0]){
                row = i -1;
                break;
            }
            else if(target == matrix[i][0]){
                return true;
            }
            row =i;
            
        }
        if(row == -1)
                row = 0;
        
        for(int i =0; i <matrix[0].length; i++){
            if(matrix[row][i] == target)
                return true;
        }
        return false;
        
    }
}
