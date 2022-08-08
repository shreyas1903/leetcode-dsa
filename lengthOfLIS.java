class Solution {
    
    
    public int result(int ind, int prev_ind, int nums[], int n, int dp[][]){
        if(ind == n) return 0;
        int take = 0;
        int not =0;
        //not take
        not = 0+result(ind+1,prev_ind,nums,n,dp);
        
        if(dp[ind][prev_ind+1] != -1) 
            return dp[ind][prev_ind+1];
        
        if(prev_ind == -1 || nums[ind] > nums[prev_ind]){
            //take
            take = 1+result(ind+1, ind,nums,n,dp);
        }
        return dp[ind][prev_ind+1] = Math.max(take,not);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n+1];
        for(int row[] :dp){
            Arrays.fill(row,-1);
        }
        
        return result(0,-1,nums,n,dp);
    }
}
