class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        for(int i =triangle.size() - 1; i >= 0; i--){
            for(int j =0; j <= i;j++){
                dp[j] = i== triangle.size()-1 ? triangle.get(i).get(j) : triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }
}
