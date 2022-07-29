class Solution {
    
    public boolean valid(int row, int col, char[][] board){
        
        int duprow = row;
        int dupcol = col;
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q') return false;
            row--;col--;
        }
        row = duprow;
        col = dupcol;
        while(row<board.length && col>=0){
            if(board[row][col] == 'Q') return false;
            row++;col--;
        }
        row = duprow;
        col = dupcol;
        while(col>=0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
            
        
        return true;
    }
    
    
    public void result(int col, char[][] board, List<List<String>> res){
        if(col == board.length){
            res.add(construct(board));return;
        }
        
        for(int row =0; row<board.length; row++){
            if(valid(row, col , board)){
                board[row][col] = 'Q';
                result(col+1,board,res);
                board[row][col] = '.';
            }
        }
        
    }
    
    
    public List<String> construct(char[][] board){
        List<String> list = new ArrayList<String>();
        for(int i=0; i < board.length;i++){
            String s = new String(board[i]);
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
        List<List<String>> res = new ArrayList<>();
        result(0,board,res);
        return res;
        
    }
}
