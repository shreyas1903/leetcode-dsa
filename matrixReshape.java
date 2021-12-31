class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int column = mat[0].length;
        
        if(rows*column != r*c) {
            return mat;
        }
        
        int[][] res = new int[r][c];
        int x=0;
        int y =0;
        
        for(int i =0; i<rows; i++){
            for(int j =0; j < column; j++){
                res[x][y] = mat[i][j];
                y++;
                
                if(y == c){
                    y = 0;
                    x++;
                }
            }
        }
        return res;
        
        
    }
}
