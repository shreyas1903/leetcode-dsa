class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> res = new Stack<>();
        res.push(-1);
        int count=0;
        int n = s.length();
        for(int i =0; i<n; i++){
            if(n ==0){
                return 0; 
            }
            if(s.charAt(i) == '('){
                res.push(i);
            }
            else{
                res.pop();
                if(res.empty()){
                    res.push(i);
                }
                else
                    count = Math.max(count, i - res.peek());
            }
        }
        return count;
    }
}
