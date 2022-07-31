class Solution {
    
    public static void result(String move, ArrayList<String> res, int vis[][],int m[][],int n, int i, int j){
        
        if(i == n-1 && j == n-1){
            res.add(move);
            return;
        }
        
        //down
        if(i+1<n && vis[i+1][j] == 0 && m[i+1][j] == 1){
            vis[i][j] = 1;
            result(move + "D", res,vis,m,n, i+1,j);
            vis[i][j] = 0;
        }
        
        //left
        if(j-1>=0 && vis[i][j-1] == 0 && m[i][j-1] == 1){
            vis[i][j] = 1;
            result(move + "L", res,vis,m,n, i,j-1);
            vis[i][j] = 0;
        }
        
        //right
        if(j+1<n && vis[i][j+1] == 0 && m[i][j+1] == 1){
            vis[i][j] = 1;
            result(move + "R", res,vis,m,n, i,j+1);
            vis[i][j] = 0;
        }
        
        //up
        if(i-1>=0 && vis[i-1][j] == 0 && m[i-1][j] == 1){
            vis[i][j] = 1;
            result(move + "U", res,vis,m,n, i-1,j);
            vis[i][j] = 0;
        }
        
        
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        int visited[][] = new int [n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                visited[i][j] = 0;
            }
        }
        ArrayList<String> res = new ArrayList<>();
        if(m[0][0]==1) {
            result("",res,visited,m,n,0,0);
        }
        return res;
    }
}
