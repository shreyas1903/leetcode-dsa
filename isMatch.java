class Solution {
    
    
    public boolean result(String s, String p, int dp[][], int i, int j){
        if(i<0 && j < 0) return true;
        if(i<0 && j >=0) return false;
        if(i>=0 && j<0){
            for (int k = 0; k <= i; k++) {
                if (p.charAt(k) != '*') {
                    return false;
                }
            }
            return true;
        }
        
        if(dp[i][j] != -1) return dp[i][j] == 1 ? true:false;
        
        if(s.charAt(j) == p.charAt(i) || p.charAt(i) == '?'){
             boolean flag = result(s,p,dp,i-1,j-1); 
                dp[i][j] = (flag==true)?1:0;
            return flag;
        }
        if(p.charAt(i) == '*'){
            boolean flag =  result(s,p,dp,i-1,j) || result(s,p,dp,i,j-1);
            dp[i][j] = (flag==true)?1:0;
            
            return flag;
        }
        dp[i][j] = 0;
        return false;
    }
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        int[][] dp = new int[n][m];
        
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        return result(s,p,dp,n-1,m-1);
    }
}
