class Solution {
    public int balancedStringSplit(String s) {
        int answer = 0;
        int l=0, r=0;
        for(char c : s.toCharArray()){
            if(c=='L')
                l++;
            else
                r++;
            
            if(l==r)
                answer++;
        }
        return answer;
    }
}
