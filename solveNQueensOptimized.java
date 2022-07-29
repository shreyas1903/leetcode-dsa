class Solution {
    
    
    public void result(int col,char[][] board, List<List<String>> res, int left[], int upper[], int lower[]){
        if(col == board.length){
            res.add(construct(board));
            return;
        }
        
        for(int row=0; row<board.length; row++){
            if(left[row] == 0 && upper[board.length - 1 + col - row] == 0 && lower[row + col] == 0){
                board[row][col] = 'Q';
                left[row] = 1;
                upper[board.length - 1 + col - row] =1;
                lower[row + col] =1;
                result(col+1,board, res,left, upper, lower);
                board[row][col] = '.';
                left[row] = 0;
                upper[board.length - 1 + col - row] =0;
                lower[row + col] =0;
            }
        }
    }
    
    
    public List<String> construct(char[][] board){
        List<String> list = new ArrayList<String>();
        for(int row=0; row<board.length; row++){
            String s = new String(board[row]);
            list.add(s);
        }
        return list;
    }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int[] left = new int[n];
        int[] upper=new int[2*n-1];
        int[] lower = new int[2*n-1];
        List<List<String>> res = new ArrayList<List<String>>();
        result(0,board,res,left,upper,lower);
        return res;
    }
}
