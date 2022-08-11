class Solution {
    public int numDistinct(String s, String t) {
        
        int[][] dp = new int[s.length()][t.length()];
        int m = s.length();
        int n = t.length();
        
        
        for(int[] x:dp) Arrays.fill(x,-1);
        return result(m -1 ,n -1,dp,s,t);
    }
    
    public int result(int i, int j,int dp[][], String s, String t){
        
        if(j<0) return 1;
        if(i<0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s.charAt(i) == t.charAt(j)){
            dp[i][j]=  result(i-1,j,dp,s,t) + result(i-1,j-1,dp,s,t);
        } 
        else{
            dp[i][j]= result(i-1,j,dp,s,t);
        }
        
        return dp[i][j];
    }
}
