class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res =new ArrayList();
        backtracking(n,0,0,"",res);
        return res;
    }
    
    public void backtracking(int n, int open, int close, String curr_str, List<String> res){
        if(curr_str.length() == n*2 && open == close){
            res.add(curr_str);
            return;
        }
        if(open < n){
            backtracking(n,open+1,close,curr_str+"(",res);
        }
        if(close < open){
            backtracking(n,open,close+1,curr_str+")",res);
        }
        return;
    }
}
