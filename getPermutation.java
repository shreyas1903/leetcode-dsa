class Solution {
    public String getPermutation(int n, int k) {
        int factorial=1;    
        List<Integer> res = new ArrayList<>();
        for(int i =1;i<n;i++){
            factorial = factorial*i;
            res.add(i);
            
        }
        res.add(n);
        k=k-1;
        String ans="";
        while(true){
            ans = ans + res.get(k/factorial);
            res.remove(k/factorial);
            if(res.size() == 0){
                break;
            }
            k = k%factorial;
            factorial = factorial/res.size();
        }
        return ans;
    }
}
