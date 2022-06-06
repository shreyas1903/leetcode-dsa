class Solution {
    public int maxDepth(String s) {
        Stack res = new Stack<>();
        int maxint = 0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                res.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                int x = res.size();
                maxint =Math.max(maxint, x);
                res.pop();
                
            }
        }
        return maxint;
    }
}
